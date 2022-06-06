/*
Egy találóskérdést kell leprogramozni. A programozási munkába minél több mindent kell bemutatni arra vonatkozóan,
hogy miket tanultál a 2. félév során. Ezek a szempontok:
•	OOP szemlélet (javaslom max 3 osztály használatát)
•	Tervezési lépések, pl UML, esetleg pszeudókód v foylamatábra
•	public/private/static/final/enum megfelelő használata
•	GitHub (commit, gitignore, readme)
•	program szétbontása package-ekre
•	GUI készítés, kép használattal
•	Tiszta kód elvei
•	Tesztkód írása (1 fontos metódusnak 1 fontos tesztesete)
3 láda közül az egyik rejti a kincset. Mindegyiken van egy felirat
(ami nem változtatható, mert belevésték a ládába), de csak az egyik láda állítása igaz! 
arany: én rejtem a kincset
ezüst: nem én rejtem a kincset
bronz: az arany hazudik
Indokold (readme fájlban a megoldás logikájának alátámasztása, pl táblázatos formában),
hogy szerinted miért ott a kincs! Ez alapján „helyezd el” a kincset a megfelelő ládába, majd…
Állj neki -a fenti elvek figyelembevételével- leprogramozni a feladatot!
*/
package main;

import nezet.KincsKeresesGUI;

public class KincsKereses {

    public static void main(String[] args) {
        new KincsKeresesGUI().setVisible(true);
        
    }
    
    
}
