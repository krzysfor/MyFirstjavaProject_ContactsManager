public class Main {


    public static void main(String [] args){

        ContactsManager myContactManager = new ContactsManager();
        Contact number1=new Contact("Jwa","123456");
        myContactManager.addContact(number1);
        System.out.println(myContactManager.friendsCount);
        System.out.println(myContactManager.myFriends[0].name);
    }


   /* public static void main(String [] args){

        System.out.println("Hello world!");
    }


    class Game {

        Game(){
            mscore = 0;
        }

        Game (int startingScore){
            score = startingScore;
        }
    }

    Game tetris = new Game();
    Game darts = new Game(501);


    class Position {

        int row = 0;
        int column = 0;

        Position(int row, int column) {
            this.row = row;
            this.column = column;
        }
    }*/


    public static class Contact {
        String  name;
        String  phoneNumber;
        Contact(String name,String phoneNumber){
            this.name= name;
            this.phoneNumber=phoneNumber;
        }
    }


    public static class ContactsManager {
        // Fields:
        Contact [] myFriends;
        int friendsCount;


        // Constructor:
        ContactsManager(){
            this.friendsCount = 0;
            this.myFriends = new Contact[500];
        }
        void addContact(Contact contact){
            myFriends[friendsCount] = contact;
            friendsCount++;
        }
        Contact searchContact(String searchName){
            for(int i=0; i<friendsCount; i++){
                if(myFriends[i].name.equals(searchName)){
                    return myFriends[i];
                }
            }
            return null;
        }
    }



}
