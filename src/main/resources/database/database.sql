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

SELECT AVG(Total), min(TOTAL), max(TOTAL) FROM Invoice;

liczbę wierszy w tabeli invoice w których długość kolumny billingcountry jest większa niż 5,
SELECT COUNT(*)  FROM Invoice
WHERE length(BillingCountry) > 5;


liczbę unikalnych dat (kolumna invoicedate), w których wystawiono faktury (tabela invoice),
SELECT COUNT(DISTINCT InvoiceDate) FROM Invoice;


daty (kolumna invoicedate), w których wystawiono co najmniej dwie faktury (tabela invoice),
SELECT InvoiceDate, COUNT(*)  FROM Invoice
GROUP BY InvoiceDate
HAVING COUNT(*) >= 2;


pięć losowych wierszy z tabeli genre (wywołania tego zapytania wiele razy powinno zwrócić różne wyniki),
SELECT * FROM Genre
ORDER BY random()
LIMIT 5;

miesięczną (kolumna invoicedate) sumę faktur (kolumna total w tabeli invoice) od kupujących
z identyfikatorem (kolumna customerid) mniejszym niż 30, wynik powinien być posortowany
po miesięcznej sumie faktur i zawierać jedynie te miesiące dla których suma jest większa od 40.

SELECT round(SUM(Total),1) AS TOTAL_COST, substr(InvoiceDate, 1, 7) AS MONTHS, CustomerId FROM Invoice
WHERE CustomerId < 30
GROUP BY MONTHS
HAVING TOTAL_COST > 40
ORDER BY TOTAL_COST


>>>>>>>>ILOCZYN KARTEZJAŃSKI<<<<<<<<<<<<

SELECT * FROM Album, Artist;

CREATE TABLE imię_męske (
    ID SERIAL PRIMARY KEY,
    NAZWA VARCHAR(100)
);

CREATE TABLE imię_żeńskie(
    ID SERIAL PRIMARY KEY ,
    NAZWA VARCHAR(100)
);


INSERT INTO  imię_męske(NAZWA)
VALUES ('Jan');

SELECT * FROM imię_męske, imię_żeńskie;



>>>>>>>>>>>>>>>>>>INNER JOIN<<<<<<<<<<<<<<<<<<<<


SELECT * FROM Album INNER JOIN Artist on Album.ArtistId = Artist.ArtistId;
SELECT * FROM Album, Artist WHERE Album.ArtistId = Artist.ArtistId;

SELECT Album.Title AS ALBUM_TITLE, Artist.Name AS BAND_NAME FROM Album INNER JOIN Artist on Album.ArtistId = Artist.ArtistId;


Innymi słowy złączenie typu LEFT OUTER JOIN zwraca:

wiersze dla których warunek złączenia jest spełniony,
wiersze z “lewej tabeli” dla których nie ma odpowiedników w prawej (*bajka* LEFT OUTER JOIN postac),

SELECT * FROM Album LEFT OUTER JOIN Artist ON Album.ArtistId = Artist.ArtistId;

SELECT * FROM Album RIGHT OUTER JOIN Artist ON Album.ArtistId = Artist.ArtistId;
Tutaj sprawa jest banalnie prosta bajka RIGHT OUTER JOIN postac zwraca te same wyniki co postac LEFT OUTER JOIN bajka :). Zatem zwykłe odwrócenie tabel wystarczy:

SELECT * FROM Artist LEFT OUTER JOIN Album on Artist.ArtistId = Album.ArtistId;




>>>>>>>>>>FULL OUTER JOIN<<<<<<<<<<<<<

FULL OUTER JOIN jest złączeniem które zwraca:

wiersze dla których warunek złączenia jest spełniony,
wiersze z “lewej tabeli” dla których nie ma odpowiedników w prawej (*bajka* LEFT OUTER JOIN postac),
wiersze z “prawej tabeli” dla których nie ma odpowiedników w lewej (bajka RIGHT OUTER JOIN *postac*),

BRAK WSPARCIA, OMIJAJĄC ->>>

SELECT * FROM Album LEFT OUTER JOIN Artist ON Album.ArtistId = Artist.ArtistId
UNION ALL
SELECT Album.*, Artist.* FROM Artist LEFT OUTER JOIN Album on Artist.ArtistId = Album.ArtistId
WHERE Artist.ArtistId IS NULL;


JOIN tu, JOIN tamPermalink
Pamiętam, że na początku mnogość pojęć robiła mi niezły mętlik w głowie. Do tego wszystkiego silniki bazy danych pozwalające na opuszczanie niektórych słów kluczowych nie pomagały. Lista niżej powinna Ci pomóc się w nich odnaleźć:

JOIN to to samo co INNER JOIN,
LEFT JOIN to to samo co LEFT OUTER JOIN,
RIGHT JOIN to to samo co RIGHT OUTER JOIN,
FULL JOIN to to samo co FULL OUTER JOIN,
CROSS JOIN to to samo co iloczyn kartezjański.


liczbę wierszy w iloczynie kartezjańskim tabel track, invoice i invoiceline (UWAGA! to zapytanie może trochę potrwać),

SELECT COUNT(*) from Track,Invoice,InvoiceLine;


tytuł albumu (kolumna title w tabeli album) i nazwę artysty
(kolumna name w tabeli artist) dla wszystkich nazw artystów zaczynających się od s,

SELECT Title, Name FROM Album INNER JOIN Artist ON Album.ArtistId = Artist.ArtistId
WHERE Name LIKE 's%'

    identyfikator i nazwę list utworów (tabela playlist i playlisttrack), które są puste,

SELECT Playlist.PlaylistId,  Name, TrackId FROM Playlist LEFT JOIN PlaylistTrack PT on Playlist.PlaylistId = PT.PlaylistId
WHERE PT.PlaylistId IS NULL;

nazwy trzech najczęściej występujących gatunków muzycznych (kolumna name w tabeli genre)
wraz z odpowiadającą im liczbą utworów (tabela track) posortowaną malejąco po liczbie utworów,

SELECT Genre.Name, COUNT( Track.GenreId) AS COUNTER FROM Genre LEFT JOIN TRACK ON Genre.GenreId = Track.GenreId
GROUP BY Genre.Name
ORDER BY COUNTER DESC
LIMIT 3;

SELECT COUNT(*) FROM Track

tytuły pięciu najdłuższych albumów (kolumna title w tabeli album) posortowanych malejąco
po ich długości (kolumna milliseconds w tabeli track),

SELECT Title, SUM(Track.Milliseconds) AS SUM FROM Album INNER JOIN Track ON Album.AlbumId = Track.AlbumId
GROUP BY  Title
ORDER BY SUM DESC
LIMIT 5;

tytuły albumów, na których występują utwory z gatunku “Reggae”,


SELECT DISTINCT Album.Title, Genre.Name from Album inner join Track on Album.AlbumId = Track.AlbumId
inner join Genre on Track.GenreId = Genre.GenreId
WHERE Genre.Name = 'Reggae';

pięć nazw list utworów, które są najdroższe (suma cen wszystkich ścieżek jest największa),

SELECT Playlist.Name, SUM(UnitPrice) from PlaylistTrack INNER JOIN Playlist ON PlaylistTrack.PlaylistId = Playlist.PlaylistId
INNER JOIN Track T on T.TrackId = PlaylistTrack.TrackId
group by Playlist.Name  ,playlist.playlistid
ORDER BY SUM(Unitprice) DESC;


