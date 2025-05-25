import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    @Test
    public void testEveryStatement() {
        //allItems = null, cardNumber = "bilokak"
        RuntimeException exOne = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, "bilokak"));
        assertEquals("allItems list can't be null!", exOne.getMessage());

        //allItems = {name = null, quantity = 1, price = 10, discount = 0.0}, cardNumber = "kakbilo"]
        RuntimeException exTwo = assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(new Item("", 1, 10, 0.0)), "kakbilo"));
        assertEquals("Invalid item!", exTwo.getMessage());

        // Тест 3: allItems=[{name = "Shej", quantity = 1, price = 1, discount = 1}], cardNumber = null;
        RuntimeException exThree = assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(new Item("Shej", 1, 1, 1)), null));
        assertEquals("Invalid card number!", exThree.getMessage());

        // Тест 4: allItems=[{name = "Shej", quantity = 11, price = 1, discount = -12}], cardnumber = "broj4ezabravih16";
        RuntimeException exFour = assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(new Item("Shej", 11, 1, -12)), "broj4ezabravih16"));
        assertEquals("Invalid character in card number!", exFour.getMessage());

        // Тест 5: allItems=[{name = "Shej", quantity = 11, price = 1, discount = -12}], cardnumber = "0755000001111111";
        double result = SILab2.checkCart(
                List.of(new Item("Shej", 11, 1, -12)),
                "0755000001111111"
        );
        assertEquals(-19.0, result);
    }

    @Test
    public void testMultipleCondition() { // if (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10)
        //Тест 1:  allItems=[{ name:"Namme", quantity:1, price:1110, discount:0.0 }]
        //
        //   Тест 2:  allItems=[{ name:"Namme", quantity:1, price:111, discount:28.9 }]
        //
        //   Тест 3:  allItems=[{ name:"Namme", quantity:11, price:111, discount:0.0 }]
        //
        //   Тест 4:  allItems=[{ name:"Namme", quantity:1, price:111, discount:0.0 }]
        //T--
        RuntimeException ex1 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(new Item("Namme", 1, 1110, 0.0)), null));
        assertEquals("Invalid card number!", ex1.getMessage());

        //FT-
        RuntimeException ex2 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(new Item("Namme", 1, 111, 28.9)), null));
        assertEquals("Invalid card number!", ex2.getMessage());

        //FFT
        RuntimeException ex3 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(new Item("Namme", 11, 111, 0.0)), null));
        assertEquals("Invalid card number!", ex3.getMessage());

        //FFF
        RuntimeException ex4 = assertThrows(RuntimeException.class, () -> SILab2.checkCart(List.of(new Item("Namme", 1, 111, 0)), null));
        assertEquals("Invalid card number!", ex4.getMessage());
    }

}
