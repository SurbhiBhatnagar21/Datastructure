package DoublyLinkedList;

public class DLLMain {

	public static void main(String[] args) {
		MySong M1 =new MySong("Abc","Titanic","john",1998);
		MySong M2 =new MySong("Pqr","Sairat","jill",1997);
		MySong M3 =new MySong("Rst","Ddlj","jim",1995);
		MySong M4 =new MySong("Uvw","Tiny","joy",1994);
		MySong M5 =new MySong("Xyz","Dark","jack",1992);
		
		DoublyLL DLL = new DoublyLL();
		DLL.showAllSongs();
		
		DLL.addSong(M1);
		DLL.addSong(M2);
		DLL.addSong(M3);
		DLL.addSong(M4);
		DLL.addSong(M5);
		
		
		DLL.showAllSongs();
		MySong M6 = new MySong("Stv","Big","Jan",1993);
		DLL.addSong(M6);
		DLL.showAllSongs();

	}

}
