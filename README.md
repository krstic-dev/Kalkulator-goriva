# Kalkulator Potrošnje i Troškova Goriva (Java)

Jednostavan konzolni Java program namijenjen za izračun prosječne potrošnje goriva na 100 kilometara, evaluaciju ekonomičnosti vozila te kalkulaciju ukupnog troška puta i cijene po pređenom kilometru.

---

## 📌 Funkcionalnosti
* **Validacija unosa:** Provjera unesenih vrijednosti za kilometražu i gorivo uz automatsko prekidanje programa (`System.exit(0)`) u slučaju neispravnih podataka ($\le 0$).
* **Analiza potrošnje:** Izračun prosjeka po formuli $(gorivo / kilometraza) \times 100$.
* **Logička procjena:** Kategorizacija vozila na ekonomično ($\le 6.0\text{ l/100 km}$) ili neekonomično pomoću `if - else` grananja.
* **Finansijski obračun:** Obračun ukupne cijene puta i cijene po jednom kilometru na osnovu unesene cijene po litri goriva.

---

## 🛠️ Korišteni koncepti
* `java.util.Scanner` za konzolni unos podataka
* Tipovi s pomičnim zarezom (`double`)
* Kontrolne strukture (`if - else`, `System.exit(0)`)
* Formatirani ispis (`System.out.printf`)
