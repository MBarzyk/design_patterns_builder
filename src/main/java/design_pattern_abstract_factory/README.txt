AbstractFactory:

Wzorce:

Fabryka Abstrakcyjna: konstrukcyjny wzorzec projektowy. Co daje?
- Przy odpowiednim użyciu (package protected) klient (użytkownik kodu) oddzielony jest od implementacji,
- Możemy ukryć klasę przed użytkownikiem (package protected)
- Tworzymy obiekty gotowe, każda metoda factory powinna zwracać gotowy obiekt
- Przeważnie obiekty tworzone przez metody są predefiniowane tj. - ich wartości pól konstruktora są nam z góry znane, np. spójrz niżej, BMW16.


Na obrazku klasa Car jest w package car, metoda main jest w innej klasie (oraz paczce)
Car nie jest publiczny, dlatego nie można go importować w innych package’ach
Metoda factory która jest w metodzie zwraca obiekt interfejsu.

- Posiadamy jedną klasę która pozwala nam na tworzenie różnych obiektów
- Nie musimy przekazywać parametrów (ale możemy). Możemy przygotować konstruktor konkretnego obiektu.
W przykładzie createBMW16 nie przyjmuje parametrów, ale zwraca obiekt wywołania:
return new Car("BMW", 30.0, 200, 4);
(Czyli spreparowany obiekt)

- Możemy ograniczyć użytkownikowi konieczność wpisywania części typów obiektów, dając mu pewnego rodzaju szablony obiektów
- Tworzymy klasy abstrakcyjne i w nich metody statyczne lub tworzymy klasę factory i do tworzenia obiektów tworzymy instancję tej klasy.
W powyższym przykładzie mamy FabrykęAbstrakcyjną (oddzielną klasę produkującą obiekty)



Jak tworzymy?
Stwórz model (klasę której obiekty będą wytwarzane przez fabrykę abstrakcyjną.
Stwórz klasę która jest abstrakcyjna
zaimplementuj w tej klasie metody (stworzeniowe) każda z nich powinna
zwracać pewien gotowy obiekt (w przykładzie używamy:
		return new Car(“bmw”, 30.0, 200, 4);
	czyli jakby:
return new DowolnyObiekt(parametr, parametr, parametr);
być statyczna
Korzystaj z klasy statycznie (bez słówka new lub obiektu):
zakładając że klasa abstrakcyjna nazywa się AbstractFactory, wywołanie wyglądałoby:
		DowolnyObiekt stworzony = AbstractFactory.metodaStworzeniowa();

Przykład:
https://bitbucket.org/nordeagda2/designpatternfactoryexample


Zadanie 1:
Stwórz klasę abstrakcyjną AbstractPC która posiada:
pole tekst - nazwę komputera
pole ComputerBrand - (enum) markę komputera
pole cpuPower - moc komputera (int 0-100)
pole gpuPower - moc grafiki komputera (double 0.00 - 1.00)
pole isOverclocked - flaga definiująca czy komputer był "podrasowany"


ComputerBrand: ASUS, HP, SAMSUNG, APPLE
Stwórz klasy dziedziczące:
AsusPC, HpPC, SamsungPC, AppleMac które dziedziczą po komputerze.
W każdej klasie stwórz metody factory. Dla każdej marki wymyśl dwa komputery.
(np. stwórz metodę createAsusN53, createAsusH23, createMacProRetina15 …)

https://bitbucket.org/nordeagda2/designpatterncomputerabstractfactory

Dodatkowe:
Dodaj klasę factory i dla dowolnych dwóch marek komputerów dodaj po jednej metodzie factory do tworzenia obiektów.

Stwórz klasę Main, dodaj kilka komputerów do listy, a następnie przeiteruj listę i wypisz wszystkie parametry komputerów na konsolę (przyda się metoda …?).

Zdanie 2:
Należy stworzyć aplikację symulującą fabrykę rowerów. Klasa Bike: ma markę, ilość miejsc, ilość przerzutek, oraz typ roweru (bicycle, tandem).

BIKE_TYPE: BICYCLE, TANDEM

Stwórz i przetestuj fabrykę abstrakcyjną (BikeFactory) która pozwala na tworzenie:

Rowerów jednoosbowych, marki KROSS, które mają 5 przerzutek
Rowerów jednoosbowych, marki MERIDA, które mają 6 przerzutek
Tandemów, marki INIANA, które mają 3 przerzutki
Rowerów jednoosbowych, marki FELT, które mają 6 przerzutek
Tandemów, marki GOETZE, które mają jedną przerzutkę

https://bitbucket.org/nordeagda2/designpatternfactorybikes


Zadanie 3:
Piszemy aplikację dla pizzerii. Stwórz klasę Pizza z listą składników i builderem, który posiada metodę dodania składnika. Po użyciu build stwórz pizzę.

Stwórz fabrykę pizz i 3 najbardziej popularne pizze. Użyj w fabryce metod stworzeniowych i wewnątrz metod twórz obiekty posługując się builderem.

Stwórz maina i w nim parser. Przetestuj aplikację komendami:

zamów HAWAJSKA
zamów SEROWA
zamów WIEJSKA

itd....

* Dopisz 3 rodzaje pizzy


Zadanie 4:
Stwórz fabrykę telefonów. Klasa telefon posiada kilka podstawowych pól:
producent, model, szerokosc ekranu, wysokosc ekranu, moc procesora, ilosc rdzeni, ilosc kart sim

Stwórz builder'a do klasy Telefon.

Stwórz fabrykę telefonów marki Samsung i stwórz metody stworzeniowe dla dwóch telefonów.
Stwórz fabrykę telefonów marki Apple  i stwórz metody stworzeniowe dla dwóch telefonów.




Zadanie 5*:
Stwórz aplikację, która jest aplikacją zgloszeniową do dziekanatu. Wyobraźcie sobie uczelnię, która posiada system webowy do dziekanatu. Taki system pozwala skladać zażalenia, wnioski, oraz różne inne pisma. Czasami problem jest taki, że aby wysłać wniosek trzeba wiedzieć co w nim napisać. Ułatwimy to użytkownikowi poprzez stworzenie szablonów formularzy, które będą tworzone przez Fabrykę Abstrakcyjną.

Stwórz klasę Application (od wniosek) która będzie reprezentować pojedynczy wniosek/pismo które możemy złożyć do dziekanatu. Klasa powinna nie być abstrakcyjna. Powinna posiadać pola:
- dataUtworzenia (LocalDateTime)
- miejsceUtworzenia (String)
- daneAplikanta (Person)
- treść (String)

Po tej klasie powinny dziedziczyć inne klasy (umieść klasę Application oraz klasy dziedziczące w jednej/oddzielnej paczce): klasa ConditionalStayApplication, SchoolarshipApplication, SocialSchoolarshipApplication, SemesterExtendApplication

Wszystkie dziedziczą po klasie Application. Każdy z nich posiada konstruktor i:
ConditionalStayApplication – posiada dodatkowo pole „oceny(grades)” (Lista liczb typu double) oraz pole reason (powód) – String.

SchoolarshipApplication – posiada dodatkowo pole grades (tak samo jak wyżej) oraz extracurricularActivities (zajęcia dodatkowe) które są listą stringów.

SocialSchoolarshipApplication – posiada pole grades, oraz totalFamilyIncome (double).

SemesterExtendApplication – posiada pole reason (String).

Stwórz fabrykę abstrakcyjną która posiada 5 metod Factory tworzących obiekty i wypełniając domyślne pola tych klas.

Person jest klasą która posiada pola : Imie, nazwisko oraz numer indeksu.
Stwórz aplikację która pyta o imię, nazwisko oraz numer indeksu użytkownika,
a następnie pyta jaki typ formularza chce wypełnić, następnie prosi o dane do wypełnienia tego formularza.

np.
Podaj imię i nazwisko, oraz numer indeksu:
Paweł Recław 00007

Jaki typ formularza chcesz wypełnić (Warunek/StypendiumNaukowe/StypendiumSocjalne/WydluzenieSemestru)?
StypendiumSocjalne

Podaj swoje oceny oddzielone przecinkami:
1, 2, 3, 5, 5, 2, 3, 3

Podaj średni dochód na członka rodziny:
50.15 zł

Dziękuję, Twój formularz został wysłany.
(Dla chętnych - DOPISZ zawartość formularza do pliku forms.txt)
(Zakończ aplikację)


