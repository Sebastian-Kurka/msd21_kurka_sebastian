# Exercise 4

## Testcases für [CalculatorTest.java](CalculatorTest.java)

- testAdd
  - vergleicht, ob der Erwartungswert ```20``` mit dem Ergebniswert ```calc.add(15.0, 5.0)``` übereinstimmt.
  - vergleicht, ob der Wert in der Variable ```result``` mit dem Ergebniswert ```calc.add(15.0, 5.0)``` übereinstimmt.

- testMinus
  - vergleicht, ob der Erwartungswert ```20``` mit dem Ergebniswert ```calc.minus(25.0, 5.0)``` übereinstimmt.
  - testet, ob auch große Werte von kleineren Werten subtrahiert werden können und negative Ergebnisse möglich sind.

- testMultiply
  - testet, ob bei zwei Werten welche miteinander multipliziert werden das richtige Ergebnis berechnet wird.
  - testet, ob Multiplikationen min 0 funktionieren.

- testDevide
  - testet, ob Divisionen das richtige Ergebnis liefern.
  - Testet, ob Divisionen mit 0 keine Fehler verursachen und je nach den gegebenen Werten entweder -Unendlich 
    oder +Unendlich zurück gibt.