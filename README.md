# Intent

- Intent used for communicating from 1 activity to any other activity and also from one application to another application.          
- We can remember intent with the word intention.

# Types of Intents:
Intent are of two types: Implicit Intent  and Explicit Intent

![1](https://user-images.githubusercontent.com/101108540/173340161-91b258c9-4744-4dfb-bbd0-04e512805b6e.jpg)


![1_agunwd17ceIyG1mgFyC8hQ](https://user-images.githubusercontent.com/101108540/173342896-eb5ce8f3-8ade-4eb5-b170-a61c5f21ba3a.png)

# Implicit Intents :− 
   • It going to connect with out side application such as call, mail, phone,see any website ..etc.
   
               Intent intent = new Intent(Intent.ACTION_VIEW);
               intent.setData(Uri.parse("http://www.your_website_name.com"));
               startActivity(intent);

# Explicit Intent :-
   • It going to connect the internal world of an application such as start activity or send data between two activities.


Steps : suppose i have to go in second activity after clicking on button of 1st activity.

1. add Button widget in .xml file.
    In attribute of Button1 Give onCLick and provide any name. here i am giving btn1.
2. In com.example.package_name right click on it and create second activity app->new->activity->empty activity.By doing this it will Generate 2 files.
    one is .java and another is .xml
    
    Now create Intent in .java file to communicate between Activity1 to Activity2
        
        Intent intent = new Intent(this,Activity2.class); //here providing 2 parameters first is context(to whom) and second is destination(to where) name.
        Toast.makeText(this, "This is Second Activity", Toast.LENGTH_SHORT).show();
        startActivity(intent);    */




This is First Page


![WhatsApp Image 2022-04-29 at 5 13 06 PM](https://user-images.githubusercontent.com/101108540/165938263-e5cd4054-f8cf-4023-85ac-59037a73d809.jpeg)


After clicking on btn1/btn2 it will redirect me to Second_Activity.









![WhatsApp Image 2022-04-29 at 5 13 06 PM (1)](https://user-images.githubusercontent.com/101108540/165938414-feec3176-be5c-48ab-8298-27176621867b.jpeg)





after clicking on btn3 it will return me to main_activity.












![WhatsApp Image 2022-04-29 at 5 13 06 PM (2)](https://user-images.githubusercontent.com/101108540/165938510-8c10f466-1b9b-45f7-961b-25280c3188ef.jpeg)




