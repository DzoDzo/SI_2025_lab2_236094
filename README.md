# SI_2025_lab2_236094
Илија Боневски 236094

![image](https://github.com/user-attachments/assets/b386cb21-34d7-4579-82d2-2f487cec5991)

3. Цикломатската комплексност е бројот на предикатни јазли + 1 = 8 + 1 = 9
4. Тест 1: allItems=null, cardnumber="bilokak" ; 51, 52, 53, 92, се опфаќа ред 53 со овој услов
   
   Teст 2: allItems=[{ name:"", quantity:1, price:10, discount:0.0 }], cardnumber="kakbilo"; 51, 52, 56, 58.1, 58.2, 59, 60, 61, 92
   
   Тест 3: allItems=[{name = "Shej", quantity = 1, price = 1, discount = 1}], cardNumber = null; 51, 52, 56, 58.1,58.2, 58.3, 59, 60, 64, 65, 68, 69, 75, 76, 86, 87, 92
   
   Тест 4: allItems=[{name = "Shej", quantity = 11, price = 1, discount = -12}], cardnumber = "broj4ezabravih16"; 51, 52, 56, 58.1, 58.2, 58.3, 59, 60, 64, 65, 68, 71, 72, 75, 76, 77, 78, 79.1, 79.2, 80, 81, 82, 92
   
   Тест 5: allItems=[{name = "Shej", quantity = 11, price = 1, discount = -12}], cardnumber = "0755000001111111"; 51, 52, 56, 58.1, 58.2, 58.3, 59, 60, 64, 65, 68, 71, 72, 75, 58.3, 76, 77, 78, 79.1, 79.2, 79.3, 80,              81, 84, 90, 92
   
           Потребни се минимум 5 тест случаи за EveryStament, т.е. со овие тест примери се опфаќат сите редови код од функцијата
5. if (item.getPrice() > 300 || item.getDiscount() > 0 || item.getQuantity() > 10);

   Mulitiple Condition критериумот гласи дека мора секоја комбинација на вистинитосните вредности на атмоските услови да се извршат барем еднаш
   
   Поради lazy eval, не мора сите 8 случаи да се испишат за да се исполни Multiple Condition критериумот, туку може со 4, и тоа: Т--, FT-, FFT, FFF //каде позицијата на Буквата се совпаѓа со позицијата на условот во if(item.getPrice() > 300 || item.getDiscount() > 0 ||      item.getQuantity() > 10), т.е FT- се однесува на item.getPrice() > 300==F, item.getDiscount() > 0 ==T, item.getQuantity()==Т/F (било што, не доаѓа до порверка на овој услов)
   
   Тест 1:  allItems=[{ name:"Namme", quantity:1, price:1110, discount:0.0 }]
   
   Тест 2:  allItems=[{ name:"Namme", quantity:1, price:111, discount:28.9 }]
   
   Тест 3:  allItems=[{ name:"Namme", quantity:11, price:111, discount:0.0 }]
   
   Тест 4:  allItems=[{ name:"Namme", quantity:1, price:111, discount:0.0 }] 

   
