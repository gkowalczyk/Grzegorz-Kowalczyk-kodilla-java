https://www.samouczekprogramisty.pl/pobieranie-danych-z-bazy-select/


SELECT * FROM INVOICE;

SELECT * FROM Invoice WHERE BillingCity = 'Dublin' AND Total > 5
OR BillingCity = 'Boston' AND TOTAL < 3 AND TOTAL > 1;

SELECT *
FROM invoice
WHERE (billingcity = 'Dublin' AND total > 5)
   OR (billingcity = 'Boston' AND total < 3 AND total > 1);

SELECT *
FROM invoice
WHERE billingstate IS NOT NULL
  AND billingcountry != 'USA';

SELECT invoicedate
     ,billingcity
     ,total
FROM invoice
WHERE billingcountry = 'Poland';

Napisz zapytanie, które zwróci wszystkie gatunki muzyczne z tabeli genre,

SELECT * FROM Genre;


Napisz zapytanie, które zwróci wszystkie stany w USA, w których wystawiono fakturę na kwotę większą niż 1

SELECT BillingState FROM Invoice WHERE BillingCountry = 'USA' AND Total > 15;

Napisz zapytanie, które zwróci wszystkie kraje, w których wystawiono fakturę na kwotę mniejszą niż 10 pomiędzy ‘2013-12-05 00:00:00’ i ‘2013-12-09 00:00:00’,

SELECT BillingCountry FROM Invoice WHERE Total < 10 AND invoicedate > '2013-12-05 00:00:00'
                                     AND invoicedate < '2013-12-09 00:00:00';


Napisz zapytanie, które zwróci wszystkie miasta i kraje gdzie wartość kolumny billingstate równa się NULL i wartość zamówienia jest
większa niż 17 oraz te gdzie wartość zamówienia jest mniejsza niż 1, billingstate nie ma wartości NULL i zostały wystawione po ‘2013-09-20 00:00:00’,

SELECT BillingCity, BillingCountry, BillingState FROM Invoice WHERE (BillingState IS NULL AND Total > 17)
OR (Total < 1 AND BillingState IS NOT NULL  AND InvoiceDate > '2013-09-20 00:00:00');

SELECT billingcity, billingcountry
FROM invoice
WHERE (billingstate IS NULL AND total > 17)
   OR (total < 1
    AND billingstate IS NOT NULL
    AND invoicedate > '2013-09-20 00:00:00');


SELECT * FROM Album WHERE Title LIKE '%''%';

SELECT * FROM Album WHERE Title LIKE '%dream%';

SELECT * FROM Invoice WHERE BillingCountry > 'A' AND BillingCountry < 'C';

SELECT * FROM Invoice WHERE BillingCountry = 'Poland' AND InvoiceDate > '2012-05-26';

SELECT * FROM Invoice WHERE BillingCountry LIKE '%Poland%' AND InvoiceDate > '2012-05-26';

SELECT * FROM Invoice WHERE BillingCountry LIKE '%Poland%';

SELECT * FROM Invoice WHERE Total BETWEEN 10 AND 20;

Innymi słowy wyświetlam wyłącznie te wiersze, które kończą się na land:

SELECT * FROM Invoice WHERE BillingCountry NOT LIKE '%nland';


SELECT * FROM Invoice WHERE BillingState IS NULL;

SELECT * FROM Invoice WHERE BillingCountry = 'USA' AND BillingState IN ('CA', 'TX')


    zwrócić wszystkie wiersze z tabeli track, dla których: unitprice jest mniejsze niż 1 i znak % zawarty jest w kolumnie name oraz kolumna name kończy się na e,

SELECT * FROM Track WHERE UnitPrice < 1 AND Name LIKE '%y%%e' ESCAPE 'y';

zwróci wszystkie wiersze z tabeli invoice, które mają uzupełnioną kolumnę billingstate i nie są ze Stanów Zjednoczonych,

SELECT * FROM Invoice WHERE BillingState IS NOT NULL AND BillingCountry NOT LIKE '%USA%';

zwróci wszystkie wiersze z tabeli invoice, które dotyczą Polski, Czech albo Węgier dla których wartość faktury przekracza 10,

SELECT * FROM Invoice WHERE BillingCountry IN ('Poland', 'Czech Republic', 'Hungary') AND Total > 10;

zwróci imiona pracowników z tabeli employee, które dotyczą pracowników urodzonych w latach 60.

SELECT * FROM Employee WHERE BirthDate BETWEEN '1960-' AND '1970-';




SELECT ...
(    FROM ...)
(   WHERE ...)
(ORDER BY ...)
(   LIMIT ...)











