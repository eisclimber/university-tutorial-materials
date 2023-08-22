# Python Tutorial

## Anaconda ("IDE" für quasi alles mit Python)

- Link (Hernterladen und Installieren): https://www.anaconda.com/products/distribution
- Anaconda Navigator(!) öffnen und kurz warten (Keine Angst, das öffnet ein paar Kommandozeilen)
- Anaconda Navigator updaten
- Dann Jupyter starten, öffnet File-System-Dialog im Browser
- Dort Notebook suchen und öffnen

## Alternative: Python, Pip und VSCode
- Installiere Python, dann neu starten
- Mit "pip install jupyter" Jupyter installieren
- Extensions in VSCode aktivieren
- File mit VSCode öffnen

## Pip

- Paketmanager für Python
- Erlaubt herunterladen von zusätzlichem Code
- Packages Herz und Seele von Python
- "import paket_xy"
- Falls ein Package nicht gefunden wird: "pip install <package_name>"

## Jupyter Notebook

- Integriert (ausführbaren) Python-Code samt Ausgaben in einen Text
- Textblock auswählen und über navigationsleiste ausführen (Achtung: Reihenfolge!!)

## Die Sprache Python

- Keine geschweiften Klammern: "{}"
  - Strukturierung durch Einrückungen (Tabs & Spaces)
  - Alles auf der gleichen Höhe ist ein Block (steht in Klammern)
  - Ausnahme: Funktionen und Programm-Flus (if-else bzw. "elif")
  
- Keine Zeilenendungen durch Zeilen: ";"
  - Stattdessen wird dient beendet der Zeilenumbruch im Code die Zeile
  - Für Code über mehrere Zeilen: Ein Backslash "\", dannach sofort ein Zeilenumbruch im Code

- Keine Datentypen
  - Programm wird zu Laufzeit interpretiert
    - Nachteil: Langsam, schwer zu debuggen
    - Vorteil: Weniger Schreibaufwand (insbesondere bei kleinen Tests)
  - Neue Versionen von Python unterstützen optinoale Typisierung -> Schneller

- Syntax
  - python_case: Alles klein, Trennung mit "_"
  - Kommentare mit #
  - Multiline Kommentare mit Multiline-Strings: ''' Kommentar '''

## (Coole) Python Konstrukte

- Variablen müssen nicht deklariert werden
  - Einfaches "x = 42" reicht
  - Achtung!!!: Alles kann überschrieben werden. Auch existierende Variablen, Funktionen

- Konsolen-Ausgabe mit "print"
  - Achtung: KEINE Addition von Strings, einfach mit Kommas trennen
    - Weil: KEINE implizite Umwandlung von Stings wie in Java
    - Explizite Umwandlung mit "str()"
  - Formats: Strings mit "Löchern" ({}) in die Werte eingesetzt werden
    - Einsetzen über: "{} {}".format(42, some_var), kurz: f'"{some_var}"
    - Direkt printen mit prinf(format-string, args*)
    - Auch exaktes formatieren, z.B. ein float mit 2 Nachkommastellen
    - Extrem weites Thema -> [Eigenrecherce](https://pyformat.info/)
    - Alter Syntax mit %

- Booleans
  - Keywords (1. Buchstabe groß!): True, False
  - (Manche) Operationen sind ausgeschrieben: and, or, not
  - Gleichheit bleibt wie üblich bei: == und !=

- Listen in Python sind immer dynamisch und nicht typisiert
  - Erstellung mit x = []
  - Zugriff mit x[0] (= 42)
  - Hinzufügen mit x.append(0)
  - Listen mit festen Intervallen können über "range(start, stop, step)" erstellt werden
    - Kurformen: "range(stop)" und "range(start, stop)"
      - Ersteres startet bei 0 und geht bis *exklusive* stop
      - Zweiteres startet bei start (inklusive) und geht bis *exklusive* stop
    - Wenn step negativ ist, läuft die Liste rückwärts

- Loops:
  - Nutzt meistens for loop in kombination mit range: for x in range(42):
  - Erstellen einer neuen Liste durch List comprehentions: [x**2 for x in range(0,5)]
    - "x**2" rechnet x^2

- Tupel:
  - Liste, aber immutable (nicht veränderbar)
  - Kann wie im Bsp implizit durch Kommata deklariert werden
  - Ermöglicht das zurückgeben von mehreren Funktionswerten (durch umwandlung in EIN Tupel)

- Funktionen:
  - Deklariert mit "def func_name(params*):"
    - Gibt wenn nichts da steht None (=null) zurück
    - Falls ein Wert zurückgegeben werden soll: "return x"
      - Achtung: Es wird nicht gecheckt, ob immer ein Wert zurückgegeben wird (Per Default: None)!!
  - Üblicherweise haben funktionen in Python extrem viele Parameter
    - Argumente in der Reihenfolge der Parameter angeben
    - Oder: parameter_name=value
    - Oft können Parameter nachträglich noch geändert werden (vgl. plt.xlabel("something"))

## Module

- Vorgefertigte Codebausteine/Funktionen
- Downloaded via Pip (falls noch nicht geschehen)
  - Bei Jupyther Notebook mit Ausrufezeichen: "!pip install <module>"
- importieren in den Code via "import module [as shorthand]"
  - z.B. "import numpy as np"
- Zugriff auf Funktionen des Moduls über Namen/Abkürzung:
  - np.array(x) # Wandelt ein Python-Array in ein spezielles NumPy-Array um
  - math.e # repräsentiert die Konstante "e"

## Mathplot (und Seaborn)

- Modul zum einfachen plotten von Werten
  - Seaborn machts noch etwas besser/schöner
- Tutorials:
  - ["Basics"](https://matplotlib.org/stable/tutorials/introductory/pyplot.html)
  - [Funktionen/API](https://matplotlib.org/stable/api/index.html)
- Ablauf:
  1. Erzeugen von Werten von x und y
  2. Plotten über plt.plot()
    - Mehrere Werte durch einen Aufruf: plot(x1, y1, x2, y2, ...)
    - Angeben der Punkt-Eigenschaften: z.B. 'r--' = red dashes; 'bs' = blue squares -> Google!!
    - Alternativ mit Parametern
  3. Weitere Konfiguration, des gesamten Plots: Titel, Label, Ausschnitt, ...
    - Via: plt.title("My Title"), ...
  4. Ausführen von plt.show() zum Anzeigen der Plots
    - Damit sich in Jupyther kein extra Fenster öffnet: "%mathplotlib inline"
- Das sollte jeder Plot haben:
  - Titel
  - x_label, y_label
  - Unterschiedliche Farben/Knoten pro Plot-Linie
  - Legende, falls mehrere Linien im Plot
  - Geigneter Ausschnitt (xlim, ylim)