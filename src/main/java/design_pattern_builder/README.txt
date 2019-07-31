Builder:
Dzięki niemu nie musimy pisać konstruktorów N parametrowych.
Pozwala na tworzenie obiektów w których możemy w kolejności ustawiać parametry.
Nie musimy tworzyć kombinacji konstruktorów dla parametrów które są opcjonalne
Można go wygenerować

Tworzymy klasę, wpisujemy pola,
Stworzenie/generowanie konstruktora pełnego,
Stworzenie klasy (pustej) statycznej publicznej wewnętrznej Builder
klikamy prawym na pełny konstruktor, wybieramy:
refactor
replace constructor with builer
wybieramy opcję existing class
wskazujemy klasę Builder

https://bitbucket.org/nordeagda2/designpatternbuilderexample

Zadanie 1:
Stwórz aplikację a w niej klasę GameCharacter która jest postacią w grze. Postać powinna mieć pola:

name,
health,
mana,
number of points

Stwórz w niej buildera.
W mainie stwórz kolekcję postaci (listę lub set) i dodaj do niej kilka takich samych postaci, oraz kilka postaci odrobinę zmodyfikowanych (punktami lub mana i życiem).

Zadanie 2:
Zadanie pieczątka.
Stwórz klasę Stamp która posiada pola:
firstDayNumber, - pierwsza cyfra daty (dnia)
secondDayNumber,- druga cyfra daty (dnia)
firstMonthNumber,- trzecia cyfra daty (miesiac)
secondMonthNumber, - czwarta cyfra daty (miesiac)
yearNumber1; - piata cyfra daty (rok)
yearNumber2; - szosta cyfra daty (rok)
yearNumber3; - siodma cyfra daty (rok)
yearNumber4; - osma cyfra daty (rok)

caseNumber = numer sprawy (int);

jak robimy pieczatke to mamy w niej pokretla ktore obracamy aby wybrac obecna date. np. ustawiam numerki na:

firstDayNumber:   1
secondDayNumber:  3
firstMonthNumber: 0
secondMonthNumber: 5
yearNumber1:      2
yearNumber2:	  0
yearNumber3:	  1
yearNumber4:	  7
caseNumber:	20

w wyniku poda:
13-05-2017:20

Stamp ma byc tworzony za pomoca buildera. Domyslnie jesli nie podamy wartosci to domyslne wartosci to:
firstDayNumber:   0
secondDayNumber:  1
firstMonthNumber: 0
secondMonthNumber:1
yearNumber1:      2
yearNumber2:	  0
yearNumber3:	  0
yearNumber4:	  1
caseNumber:	1

Zadanie 3:
Stworzymy aplikację symulującą komunikację między użytkownikami. Aplikacja będzie działać na zasadzie pokoju chat'owego.

Stwórz klasę Mail która posiada pola:
	- tresc
	- nadawca
	- data nadania
	- data odbioru
	- adres ip nadania
	- adres ip odebrania
	- nazwe serwera posredniego
	- nazwe skrzynki pocztowej
	- protokol komunikacji
	- typ wiadomości (UNKNOWN, OFFER, SOCIAL, NOTIFICATIONS, FORUM)
	- flagę(boolean) - czy szyfrowane
	- flagę(boolean) - isSpam

Stwórz klasę Client która:
	- posiada pole name
	- posiada pole List<Mail> - lista/skrzynka wiadomości klienta
	- readMail(Mail m) - która powoduje dodanie wiadomości do skrzynki i wypisanie komunikatu:
"Klient " + this.getName() + " otrzymal maila"

Stwórz klasę MailServer która posiada listę podłączonych klientów (pole klasy). Metody:
	- connect(Client c) - powoduje podłączenie klienta do serwera, czyli dodanie go do listy ( tej która jest polem klasy)
	- disconnect(Client c) - powoduje odłączenie klienta
	- sendMessage(Mail m, Client sender) - powoduje rozesłanie wiadomości do wszystkich klientów oprócz nadawcy. Przed przekazaniem wiadomości należy ustawić jej datę odebrania na teraz (now()).

Sprawdź poprawność działania aplikacji. Napisz testy weryfikujące poprawność działania aplikacji. DLA CHĘTNYCH

TREŚĆ DODATKOWA:
Zakładamy że istnieją pewne typy maili. Np. na skrzynce pocztowej gmail maile są segregowane na skrzynki: społecznościowe, powiadomienia, oferty, fora.

Dodatkowo do poprzedniej treści stwórz fabrykę wiadomości która dla wszystkich typów wiadomości pozwala na szybkie utworzenie wiadomości przesyłając do fabryki jedynie treść.

podpowiedź: stwórz fabrykę, gdzie kazda z metod posiada jeden parametr i jest nim treść maila, a resztę obiektu stwórz korzystając ze wcześniej stworzonego buildera.

Wykorzystaj metody fabryki w mainie (stwórz maile) i prześlij je wykorzystując klienta. Zweryfikuj poprawność działania aplikacji, dopisz testy.

https://bitbucket.org/nordeagda2/designpatternmail

