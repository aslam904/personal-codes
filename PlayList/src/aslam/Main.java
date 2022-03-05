package aslam;

import java.util.*;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Love don't mean a thing", 4.22);
        album.addSong("Holy man", 4.3);
        album.addSong("Hold on", 5.6);
        album.addSong("Lady double dealer", 3.21);
        album.addSong("You can't do it right", 6.23);
        album.addSong("High ball shooter", 4.27);
        album.addSong("The gypsy", 4.2);
        album.addSong("Soldier of fortune", 3.13);
        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("I put the finger on you", 3.25);
        album.addSong("Lets go", 3.45);
        album.addSong("Inject the venom", 3.33);
        album.addSong("Snowballed", 4.51);
        album.addSong("Evil walks", 3.45);
        album.addSong("C.O.D.", 5.25);
        album.addSong("Breaking the rules", 5.32);
        album.addSong("Night of the long knives", 5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("You can't do it right", playList);
        albums.get(0).addToPlayList("Holy man", playList);
        albums.get(0).addToPlayList("Speed king", playList);  // Does not exist
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(24, playList);  // There is no track 24

        play(playList);
    }

        private static void play(LinkedList<Song> playList){
            Scanner sc=new Scanner(System.in);
            ListIterator<Song> li=playList.listIterator();
            boolean quit=false;
            boolean move=true;
            printMenu();
            sc.nextLine();
            if(playList.isEmpty()){
                System.out.println("The playlist has no songs ");
            }else{
                System.out.println("The first song is "+li.next().toString());

            }
            while(!quit){
                int action= sc.nextInt();
                switch(action){
                    case 0:
                        quit=true;
                        System.out.println("Closing player...");
                        break;

                    case 1:
                        if(!move) {
                            if (li.hasNext()) {
                                System.out.println(li.next());
                            }
                            move = true;
                        }

                        if(li.hasNext()){
                            System.out.println("Playing next song "+li.next().toString());
                        }else{
                            System.out.println("reached end of the list");
                            move=false;
                        }
                        break;

                    case 2:
                        if(move){
                            if(li.hasPrevious()){
                                System.out.println(li.previous());
                            }
                            move=false;
                        }
                        if(li.hasPrevious()){
                            System.out.println("Playing previous song "+li.previous().toString());
                        }else{
                            System.out.println("Reached first song");
                            move=true;
                        }
                        break;

                    case 3:
                        printMenu();
                        break;

                    case 4:
                        printList(playList);
                        break;

                    case 5://for replaying the current song
                        if(move){
                            if(li.hasPrevious()){
                                System.out.println("Now replaying "+li.previous().toString());
                                move=false;
                            }else{
                                System.out.println("we are at the start of the list");
                            }
                        }else{
                            if(li.hasNext()){
                                System.out.println("Now replaying "+li.next().toString());
                                move=true;
                            }else{
                                System.out.println("We are at the end of the list");
                            }
                        }
                        break;
                }
            }
        }

        private static void printMenu(){
            System.out.println("Available actions:\npress");
            System.out.println("0 - to quit\n" +
                    "1 - to play next song\n" +
                    "2 - to play previous song\n" +
                    "3 - print available actions\n" +
                    "4 - list songs in the playlist\n" +
                    "5 - to replay the current song\n");
        }

        private static void printList(LinkedList<Song> playlist){
            Iterator<Song> i=playlist.iterator();
            System.out.println("=====================================================");
            while(i.hasNext()){
                System.out.println(i.next());
            }
            System.out.println("===================================================");
        }

}


