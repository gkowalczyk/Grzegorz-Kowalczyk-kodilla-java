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

SELECT * FROM Genre LIMIT 5 OFFSET 10;


SELECT billingcountry
FROM invoice;

W przypadku tego typu zapytań z pomocą przychodzi wyrażenie DISTINCT. Pozwala ono na odfiltrowanie powielonych wierszy. Proszę spójrz na przykład:
SELECT DISTINCT billingcountry
FROM invoice



SELECT DISTINCT billingcountry
              ,billingcity
FROM invoice;



Język SQL bardzo często używany jest do generowania różnego rodzaju raportów.
Raporty te lepiej przegląda się jeśli są odpowiednio uporządkowane. W języku SQL do sortowania wyników używa się wyrażenia ORDER BY. Proszę spójrz na przykład poniżej:

SELECT NamE FROM Genre ORDER BY Name;

SELECT NamE FROM Genre ORDER BY Name DESC ;

SELECT DISTINCT BillingCountry, BillingState FROM Invoice ORDER BY BillingCountry DESC, BillingState;

SELECT DISTINCT billingcountry
FROM invoice
ORDER BY billingcity;


SELECT GenreId AS 'ID', Name AS 'GENRE NAME' FROM Genre LIMIT 5;

SELECT NAME  FROM Genre UNION ALL
SELECT  DISTINCT BillingCity FROM Invoice ORDER BY Name;


SELECT genreid
     ,name AS xxx
FROM genre
UNION ALL
SELECT invoiceid
     ,billingcity
FROM invoice
UNION
SELECT albumid
     ,title
FROM album
ORDER BY xxx
LIMIT 10;

zwróci dziesięć najdłuższych ścieżek
(tabela track, kolumna milliseconds), weź pod uwagę tylko te, których kompozytor (kolumna composer) zawiera literę b,

SELECT NAME, Milliseconds, Composer FROM Track
WHERE Composer LIKE '%b%'
ORDER BY Milliseconds DESC
LIMIT 10;


zwróci pięć najtańszych ścieżek (tabela track, kolumna unitprice) dłuższych niż minuta,

SELECT NAME, UnitPrice,Milliseconds FROM Track
WHERE Milliseconds > 60000
ORDER BY UnitPrice
LIMIT 5;

zwróci unikalną listę dziesięciu kompozytorów których ścieżki kosztują mniej niż 2$ posortowanych malejąco według
identyfikatora gatunku (kolumna genreid) i rosnąco według rozmiaru (kolumna bytes),

SELECT DISTINCT Composer , UnitPrice, GenreId, Bytes  FROM Track
WHERE UnitPrice < 2
ORDER BY GenreId DESC, Bytes
LIMIT 10;


zwróci dwie kolumny. Pierwsza z nich powinna zawierać ścieżki (kolumna name) droższe niż 1$ i poprawnych kompozytorów
(kolumna composer nie ma wartości NULL) pod nazwą magic thingy. Druga powinna zawierać
liczbę bajtów. Wynik powinien zawierać dziesięć wierszy i być posortowany rosnąco po liczbie bajtów3,

SELECT NAME AS 'MAGIC THINGY', Bytes FROM Track
WHERE UnitPrice > 1
  UNION ALL
SELECT Composer, Bytes FROM Track WHERE Composer IS NOT NULL
ORDER BY Bytes
LIMIT 10;

zwróci piątą stronę z fakturami (tabela invoice) zakładając,
że na stronie znajduje się dziesięć faktur i sortowane są według identyfikatora (kolumna invoiceid),


SELECT * FROM Invoice
ORDER BY InvoiceId
LIMIT 10
OFFSET 40;


>>>>>>Funkcje i grupowanie wierszy w SQL<<<<<<<<<<

SELECT length('ABCD');

SELECT DISTINCT length(BillingState)
FROM Invoice;

SELECT DISTINCT length(BillingState) AS LEN
FROM Invoice
ORDER BY LEN;


SELECT * FROM Invoice WHERE length(BillingState) > 3;


SELECT max(length(BillingState)) FROM Invoice;

SELECT ABS(-2);

SELECT lower('ABC');

SELECT random();

SELECT substr(12345 ,2,5);

SELECT upper('abc');

>>>>>>>Grupowanie wierszy przy pomocy GROUP BY <<<<<<<<<<

SELECT BillingCountry, max(TOTAL) FROM Invoice
GROUP BY BillingCountry
ORDER BY Total, BillingCountry;


SELECT billingcountry
     ,billingstate
     ,MAX(total)
FROM invoice
GROUP BY billingcountry
       ,billingstate
LIMIT 5;


SELECT BillingCountry, AVG(Total) FROM Invoice
GROUP BY BillingCountry
ORDER BY AVG(Total);


SELECT BillingCountry, MIN(TOTAL) FROM Invoice
GROUP BY BillingCountry
ORDER BY Total, BillingCountry;


SELECT BillingCountry, SUM(TOTAL) FROM Invoice
GROUP BY BillingCountry
ORDER BY SUM(TOTAL);


SELECT COUNT(CustomerId) FROM Invoice;

SELECT COUNT(*) FROM Invoice;


SELECT COUNT(DISTINCT CustomerId) FROM Invoice;

Odpowiadając jednym zdaniem możesz powiedzieć, że klauzula
WHERE służy do filtrowania wyników zapytania biorąc pod
uwagę pojedynczy wiersz, natomiast klauzula HAVING pozwala
na filtrowanie
wyników na podstawie zgrupowanych wartości.

SELECT BillingCountry, SUM(Total) AS SUM FROM Invoice
GROUP BY BillingCountry
HAVING SUM > 100
ORDER BY SUM;

SELECT BillingCountry, SUM(TOTAL) AS SUM FROM Invoice
WHERE BillingCity != 'Ottawa'
GROUP BY BillingCountry
HAVING SUM >100;



średnią, minimalną i maksymalną wartość kolumny total w tabeli invoice,
























