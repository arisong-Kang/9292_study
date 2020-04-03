SELECT
  A.NAME,
  sum(A.cnt) AS "횟수"
FROM
  (
    SELECT
      DISTINCT NAME,
      CART_ID,
      1 AS "cnt"
    FROM
      CART_PRODUCTS
    GROUP BY
      CART_ID,
      NAME
    ORDER BY
      NAME
  ) A
GROUP BY
  NAME;