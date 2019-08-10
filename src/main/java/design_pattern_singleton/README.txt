Singleton
Źle użyty może być antywzorcem (może zaburzać czytelność i ład kodu)
Pomaga w przypadku, gdy chcemy stworzyć tylko jedną instancję danego obiektu.
Zapewnia nam globalny (statyczny) dostęp do instancji obiektu
Warto używać kiedy chcemy mieć tylko jedną instancję danego obiektu i chcemy się upewnić że nigdzie nie zostanie stworzona druga instancja tej samej klasy
Może być oparty o enuma lub być klasą z getterem dla instancji.
Jak budować?
Na obrazku po lewej stworzony singleton przez klasę ze statyczną instancją obiektu, o prawej w oparciu o enuma. Singleton posiada jedno pole (jest nią lista) i getter to tej listy.


Wywołanie:
(lewa strona):
			AsteriskSingleton.getInstance().call();
(prawa strona):
			AsteriskSingleton.instance.call();


Przykład: https://bitbucket.org/nordeagda2/designpatternsingletonexample



Zadanie 1: (Przykład)
Stwórz prostą aplikację, w której użyjemy licznika. Niech licznik będzie prostym singletonem. Celem licznika jest przechowywanie aktualnych numerów klientów.


Mamy pocztę, a na poczcie 3 sposoby wygenerowania numerku.
1 sposób to przez automat, 2 przez rejestrację (okienko), 3 przez internet. (3 klasy)

W linii poleceń 3 komendy generują różne tickety uzyskując dostęp do tej samej instancji singletona z 3 miejsc.

Zadanie: https://bitbucket.org/javagda5/designpatterns/overview


Zadanie 2:

Stworzymy praktyczny zbiór klas odpowiadający za przechowywanie konfiguracji
wewnątrz aplikacji. Naturalne jest posiadanie w programie plików konfiguracyjnych
które zawierają pewne parametry wykonania. My stworzymy aplikację która będzie ładowała
dane z pliku konfiguracyjnego i będzie przechowywała w singletonie (aby mieć do nich dostęp wszędzie).

Nasza aplikacja będzie czymś w rodzaju gry. Zasada działania gry. Po rozpoczęciu gry aplikacja losuje dwie liczby, oraz losuje działanie matematyczne, a następnie zadaje pytanie użytkownikowi:
Ile wynosi {liczba1} {działanie} {liczba2}?

i użytkownik musi odpowiedzieć. Przykład:

liczba wylosowana 1 : 50
liczba wylosowana 2 : 30
działanie wylosowane : *

Zadane pytanie:
Ile wynosi 50 * 30?


Jeśli użytkownik odpowie poprawnie otrzymuje punkt, jeśli niepoprawnie nie otrzymuje punktu.

Aplikacja ma ustawienia ładowane z pliku:
zakres_liczby_1=1000
zakres_liczby_2=10000
dostepne_dzialania=*/+-
ilosc_rund=10

Na podstawie tych ustawien powinna byc prowadzona rozgrywka 10 rund. po 10 rundach zaprezentuj uzytkownikowi wynik.
Stwórz:
- klasę która odpowiada za czytanie konfiguracji z pliku i ładowanie go do klasy "MySettings"
- klasę MySettings która posiada mapę konfiguracji ( nie musi być mapa, mogą być 4 zmienne)


*Dodatkowe:
Wykonaj singletona na 3 sposoby:
eager
lazy
używając enum


Zadanie 3:
Stwórz aplikację Gra w Wojnę. Celem aplikacji jest symulowanie poprawnej gry w wojne (karcianki).

Dopiero po poprawnym rozwinięciu gry stwórz w niej singleton.
Jeśli posiadasz istniejącą implementacje, możesz ją zmodyfikować. Celem ćwiczenia jest stworzenie takiej gry, w której liczone są statystyki:
ilość ‘wojen’
ilość wygranych wojen przez gracza A i B
największa wygrana bitwa
W modelu obiektowym ciężko jest stworzyć instancję która będzie dostępna wszędzie i będzie w różnych miejscach gromadziła statystyki. Do tego zadania posłuż się singletonem, jako instancją która dostępna wszędzie pozwala gromadzić tego typu dane.
