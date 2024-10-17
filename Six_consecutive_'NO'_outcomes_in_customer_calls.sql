WITH RankedCalls AS (
    SELECT
        call_id,
        user_id,
        outcome,
        date_of_call,
        ROW_NUMBER() OVER (PARTITION BY user_id ORDER BY date_of_call) AS call_num,
        ROW_NUMBER() OVER (PARTITION BY user_id, outcome ORDER BY date_of_call) AS outcome_num
    FROM calls
),
ConsecutiveFailures AS (
    SELECT
        call_id,
        user_id,
        date_of_call::text,
        call_num - outcome_num AS grp
    FROM RankedCalls
    WHERE outcome = 'No'
),
GroupedFailures AS (
    SELECT
        user_id,
        date_of_call,
        COUNT(*) OVER (PARTITION BY user_id, grp ORDER BY date_of_call) AS consecutive_failures,
        ROW_NUMBER() OVER (PARTITION BY user_id, grp ORDER BY date_of_call) AS rn
    FROM ConsecutiveFailures
)
SELECT
    user_id,
    date_of_call
FROM GroupedFailures
WHERE consecutive_failures = 6 AND rn = 6
ORDER BY user_id, date_of_call;