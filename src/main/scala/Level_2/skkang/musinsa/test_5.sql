SELECT
   G.rv_cnt AS "후기 수",
   G.space_cnt AS "공간 수"
FROM (
(SELECT
     "0" AS rv_cnt,
      0 AS space_cnt
    FROM
      PLACES
)
UNION
(
    SELECT
      D.review_range AS rv_cnt,
      count(1) AS space_cnt
    FROM
      (
        SELECT
          C.ID,
          CASE WHEN C.review = 0 THEN "0"
          WHEN C.review < 50 AND C.review > 0 THEN "< 50"
          WHEN C.review < 100  AND C.review >= 50 THEN "< 100"
          WHEN C.review >= 100 THEN ">= 100" END AS "review_range"
        FROM
          (
            SELECT
              A.ID,
              count(1) AS "review"
            FROM
              PLACES A
              JOIN PLACE_REVIEWS B ON A.ID = B.PLACE_ID
            GROUP BY
              A.ID
          ) C
      ) D
    GROUP BY
      D.review_range
  )
  ORDER BY
      LENGTH(rv_cnt)
 ) G;