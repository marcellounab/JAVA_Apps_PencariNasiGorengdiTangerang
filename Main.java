package aplikasipencarinasgor;


import java.util.Scanner;
import java.util.Vector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
	// signup
	Scanner iu = new Scanner(System.in);
	Vector<String>usersID = new Vector<>();
	Vector<String>passwordsID = new Vector<>();

	String userID = "";
	String passwordID = "";

	//Login
	String userLog = "";
	String passwordLog = "";

	//Data NasGor

	Vector<String> names = new Vector<>();
	Vector<Double> ratings = new Vector<>();
	Vector<String> adds = new Vector<>();

	public void NamesAscen(Vector<String>names, Vector<Double>ratings, Vector<String>adds) {
		for (int i = 0; i < names.size(); i++) {
			for (int j = 0; j < names.size()-i-1; j++) {
				if(names.get(j).compareTo(names.get(j+1)) > 0 ) {
					String temp1 = names.get(j);
					names.set(j, names.get(j+1));
					names.set(j+1,temp1);

					double temp2 = ratings.get(j);
					ratings.set(j, ratings.get(j+1));
					ratings.set(j+1,temp2);

					String temp3 = adds.get(j);
					adds.set(j, adds.get(j+1));
					adds.set(j+1,temp3);

				}
			}
		}

	}

	public void NamesDescen(Vector<String>names, Vector<Double>ratings, Vector<String>adds) {
		for (int i = 0; i < names.size(); i++) {
			for (int j = 0; j < names.size()-i-1; j++) {
				if(names.get(j).compareTo(names.get(j+1)) < 0 ) {
					String temp1 = names.get(j);
					names.set(j, names.get(j+1));
					names.set(j+1,temp1);

					double temp2 = ratings.get(j);
					ratings.set(j, ratings.get(j+1));
					ratings.set(j+1,temp2);

					String temp3 = adds.get(j);
					adds.set(j, adds.get(j+1));
					adds.set(j+1,temp3);

				}
			}
		}

	}

	public void RatingsAscen(Vector<String>names, Vector<Double>ratings, Vector<String>adds) {
		for (int i = 0; i < ratings.size(); i++) {
			for (int j = 0; j < ratings.size()-i-1; j++) {
				if(ratings.get(j) > ratings.get(j+1) ) {

					String temp1 = names.get(j);
					names.set(j, names.get(j+1));
					names.set(j+1, temp1);

					double temp2 = ratings.get(j);
					ratings.set(j, ratings.get(j+1));
					ratings.set(j+1, temp2);

					String temp3 = adds.get(j);
					adds.set(j, adds.get(j+1));
					adds.set(j+1, temp3);


				}
			}
		}

	}

	public void RatingsDescen(Vector<String>names, Vector<Double>ratings, Vector<String>adds) {
		for (int i = 0; i < ratings.size(); i++) {
			for (int j = 0; j < ratings.size()-i-1; j++) {
				if(ratings.get(j) < ratings.get(j+1) ) {

					String temp1 = names.get(j);
					names.set(j, names.get(j+1));
					names.set(j+1, temp1);

					double temp2 = ratings.get(j);
					ratings.set(j, ratings.get(j+1));
					ratings.set(j+1, temp2);

					String temp3 = adds.get(j);
					adds.set(j, adds.get(j+1));
					adds.set(j+1, temp3);


				}
			}
		}

	}

	public void viewAll(Vector<String>names, Vector<Double>ratings, Vector<String>adds) {
		System.out.println("==========================================================================================================================");
		System.out.println("                                                    NasGor in Tangerang                                                   ");
		System.out.println("==========================================================================================================================");
		for (int i = 0; i < names.size(); i++) {
			System.out.println();
			System.out.printf("%d. Name    : %s \n", i+1,names.get(i));
			System.out.printf("    Rating  : %.1f \n", ratings.get(i));
			System.out.printf("    Address : %s \n", adds.get(i));
			System.out.println();
			System.out.println("==========================================================================================================================");
		}
		System.out.println();

	}


	//add favorite
	int favorite = 0;
	Vector<String> namesF = new Vector<>();
	Vector<Double> ratingsF = new Vector<>();
	Vector<String> addsF = new Vector<>();

	public void viewFavorite(Vector<String>namesF, Vector<Double>ratingsF, Vector<String>addsF) {
		System.out.println("==========================================================================================================================");
		System.out.println("                                                    NasGor in Tangerang                                                   ");
		System.out.println("==========================================================================================================================");
		for (int i = 0; i < namesF.size(); i++) {
			System.out.println();
			System.out.printf("%d. Name    : %s \n", i+1,namesF.get(i));
			System.out.printf("    Rating  : %.1f \n", ratingsF.get(i));
			System.out.printf("    Address : %s \n", addsF.get(i));
			System.out.println();
			System.out.println("==========================================================================================================================");
		}
		System.out.println();

	}

	//remove favorite

	int remove = 0;

	//menu
	int menu1 = 0;
	int menu2 = 0;
	int menu3 = 0;

	public void printmenu1() {
		System.out.println("NasGor TGR");
		System.out.println("===========");
		System.out.println("1. Login");
		System.out.println("2. Register");
		System.out.println("3. About");
		System.out.println("4. Exit");
		System.out.println("===========");
		System.out.print(">> ");
	}

	public void printmenu2() {
		System.out.println("hallo, <" + userLog + ">");
		System.out.println("1. View all ");
		System.out.println("2. Add Favorite");
		System.out.println("3. View Favorite");
		System.out.println("4. Remove favorite");
		System.out.println("5. Back");
		System.out.println(">> ");

	}

	public void printmenu3() {
		System.out.println("1. Sort NasGor by Name Ascending");
		System.out.println("2. Sort NasGor by Name Descending");
		System.out.println("3. Sort NasGor by Rating Ascending");
		System.out.println("4. Sort NasGor by Rating Descending");
		System.out.println("5. Back");
		System.out.print(">> ");
	}

	public Main() {
		//menyimpan data nama NasGor 
		names.add("Nasi Goreng Gila Pasar Lama Tangerang");
		names.add("Nasi Goreng Kelenteng");
		names.add("Nasi Goreng Mamake Sangiang");
		names.add("Nasi Goreng Joss");
		names.add("Nasi Goreng Gila");
		names.add("Nasi Goreng Saudara");
		names.add("Nasi Goreng Kambing 99 - Wawan");
		names.add("Nasi Goreng Denok");
		names.add("Nasi Goreng Muncul Malam");
		names.add("Nasi Goreng Cak Doel (Enak)");
		names.add("Nasi Goreng Siduel");
		names.add("Nasi Goreng Imam ADP");
		names.add("Nasi Goreng Bang Ipoel Paramount");
		names.add("Nasi Goreng Askara");
		names.add("Nasi Goreng Tresno");
		names.add("Nasi Goreng Mugi lestari, ciledug");
		names.add("Nasi Goreng Mas Joko Karawaci");
		names.add("Nasi Goreng Kopral");
		names.add("Nasi Goreng Gila Gondrong Obama Karawaci");
		names.add("Nasi Goreng Gila");

		// menyimpan data rating NasGor
		ratings.add(4.3);
		ratings.add(4.5);
		ratings.add(5.0);
		ratings.add(5.0);
		ratings.add(4.7);
		ratings.add(5.0);
		ratings.add(4.3);
		ratings.add(4.9);
		ratings.add(4.5);
		ratings.add(4.6);
		ratings.add(4.6);
		ratings.add(4.5);
		ratings.add(4.3);
		ratings.add(4.9);
		ratings.add(4.6);
		ratings.add(4.9);
		ratings.add(4.6);
		ratings.add(4.7);
		ratings.add(4.2);
		ratings.add(4.5);

		// menyimpan data address NasGor
		adds.add("Jalan Kisamaun, Sukasari, RT.005/RW.006, Sukasari, Kec. Tangerang, Kota Tangerang, Banten 15118");
		adds.add("Jalan Kelapa Gading Barat Blok CB 3 No.7, Pakulonan Bar., Kec. Klp. Dua, Tangerang, Banten 15810");
		adds.add("Jl. Moh. Toha No.2, RT.003/RW.011, Periuk Jaya, Kec. Periuk, Kota Tangerang, Banten 15131");
		adds.add("Jl. Kav. Perkebunan Raya No.174-177, Panunggangan Bar., Kec. Cibodas, Kota Tangerang, Banten 15810");
		adds.add("Jl. Ruko Premier Park II, RT.007/RW.011, Cikokol, Kec. Tangerang, Kota Tangerang, Banten 15117");
		adds.add("Jl. Pinang-Kunciran, RT.001/RW.007, Pinang, Kec. Pinang, Kota Tangerang, Banten 15143");
		adds.add("Jl. A. Damyati, RT.006/RW.003, Sukarasa, Kec. Tangerang, Kota Tangerang, Banten 15118");
		adds.add("Jalan Raya PLP Curug KM 0-3 Kadu Jaya Curug, Kabupaten Tangerang, Kadu, Kec. Curug, Tangerang, Banten 15710");
		adds.add("Jalan KH Hasyim Ashari, Gg. H. Pendek, RT.001/RW.008, Nerogtog, Kec. Pinang, Kota Tangerang, Banten 15145");
		adds.add("Blok, Jl. Cendana II Blok C6 No.1, RT.008/RW.004, Cipondoh Makmur, Cipondoh, Tangerang City, Banten 15148");
		adds.add("Gg. H. Sa'aba, RT.001/RW.006, Gandasari, Kec. Jatiuwung, Kota Tangerang, Banten 15810");
		adds.add("Jl. Raya Karawaci / Imam Bonjol No.71A, RT.005/RW.005, Sukajadi, Kec. Karawaci, Kota Tangerang, Banten 15113");
		adds.add("Blok AK1 No.27, Jl. Klp. Gading Sel., Pakulonan Bar., Kec. Klp. Dua, Tangerang, Banten 15810");
		adds.add("Jl. Arya Wangsakara No.29, RT.001/RW.9, Uwung Jaya, Kec. Cibodas, Kota Tangerang, Banten 15132");
		adds.add("Jl. KH Hasyim Ashari No.62, RT.001/RW.004, Buaran Indah, Kec. Tangerang, Kota Tangerang, Banten 15119");
		adds.add("Jl. Raden Patah No.01, RT.001/RW.009, Sudimara Bar., Kec. Ciledug, Kota Tangerang, Banten 15151");
		adds.add("Jl. Gatot Subroto No.KM 2,5, RT.001/RW.001, Cimone, Kec. Karawaci, Kota Tangerang, Banten 15114");
		adds.add("Jl. KH Hasyim Ashari No.51, RT.005/RW.013, Buaran Indah, Kec. Tangerang, Kota Tangerang, Banten 15119");
		adds.add("Jalan Borobudur Raya No.18, Cibodasari, RT.004/RW.012, Cibodas Baru, Kec. Cibodas, Tangerang, Banten 15810");
		adds.add("Jalan Raya Kutabumi Rt 04 Rw 04 Depan Pom Bensin Kutabumi, Karet, Kec. Tangerang, Tangerang, Banten 15131");

		do {
			clearscreen();
			printmenu1();
			menu1 = iu.nextInt();
			iu.nextLine();


			if (menu1 == 1) {

				//doing login
				clearscreen();

				do {
					System.out.print("input name : ");
					userLog = iu.nextLine();

					System.out.print("input password : ");
					passwordLog = iu.nextLine();

					if ( !(userID.contains(userLog)) &&  !(passwordID.contains(passwordLog)) && userID.isEmpty() && passwordID.isEmpty()){
						clearscreen();
						System.out.println("user ID not found");
						iu.nextLine();
					}

				} while (!(userID.contains(userLog)) && !(userID.contains(passwordLog)) && userID.isEmpty() && passwordID.isEmpty());

				clearscreen();
				System.out.println("Login Success !!");
				iu.nextLine();

				do {
					clearscreen();
					printmenu2();
					menu2 = iu.nextInt();
					iu.nextLine();

					
					if(menu2 == 1) {
						
						//doing viewAll
						do {
							clearscreen();
							viewAll(names, ratings, adds);

							printmenu3();
							menu3 = iu.nextInt();
							iu.nextLine();

							if (menu3 == 1) {
								NamesAscen(names, ratings, adds);
							}else if(menu3 == 2) {
								NamesDescen(names, ratings, adds);
							}else if(menu3 == 3) {
								RatingsAscen(names, ratings, adds);
							}else if(menu3 == 4) {
								RatingsDescen(names, ratings, adds);
							}else if(menu3 == 5) {
								break;
							}

						} while (true);

						
					}else if(menu2 == 2) {
						
						//doing add favorite
						clearscreen();
						viewAll(names, ratings, adds);

						do {
							System.out.print("input index [1-" + names.size() + "] to add favorite : ");
							favorite = iu.nextInt();
							iu.nextLine();
						} while (favorite < 1 || favorite > names.size());

						//add to favorite
						namesF.add(names.get(favorite-1));
						ratingsF.add(ratings.get(favorite-1));
						addsF.add(adds.get(favorite-1));

						clearscreen();
						System.out.println("Success to Add !!");
						iu.nextLine();


					}else if(menu2 == 3) {
						
						//doing view favorite
						if (!(namesF.isEmpty())) {
							System.out.println("Your Favorite -------->");
							System.out.println();
							viewFavorite(namesF, ratingsF, addsF);
							System.out.println("Press Enter to Continue");
							iu.nextLine();

						}else {
							clearscreen();
							System.out.println("Please add favorite first !!");
							iu.nextLine();
						}


						
					}else if(menu2 == 4) {
						
						//doing remove favorite
						if (!(namesF.isEmpty())) {
							do {
								System.out.print("input index [1-" + namesF.size() + "] to remove favorite : ");
								remove = iu.nextInt();
								iu.nextLine();
							} while (remove < 1 || remove > namesF.size());

							// doing remove
							
							namesF.remove(remove-1);
							ratingsF.remove(remove-1);
							addsF.remove(remove-1);

							clearscreen();
							System.out.println("Success to Remove !!");
							iu.nextLine();

						}else {
							clearscreen();
							System.out.println("Please add favorite first !!");
							iu.nextLine();
						}
						
						
			
					}else if(menu2 == 5) {
						//doing back
						break;
					}


				} while (true);


			}else if(menu1 == 2) {
				
				//doing register
				clearscreen();
				do {
					System.out.print("Please input your name : ");
					userID = iu.nextLine();

				} while (userID.length() > 20);

				do {
					System.out.print("Please input your pass [must more than 10 characters] : ");
					passwordID = iu.nextLine();
				} while (passwordID.length() < 10);

				usersID.add(userID);
				passwordsID.add(passwordID);

				clearscreen();
				System.out.println("Register is successful !!");
				iu.nextLine();


			}else if(menu1 == 3) {
				
				//doing about
				clearscreen();
				System.out.println("NasGor Version 0.01 ");
				System.out.println();
				System.out.println("-------------------------------------ABOUT NASGOR----------------------------------");
				System.out.println("This \"NasGor\" application displays all \"Nasi Goreng\" in Tangerang and there are");
				System.out.println("several features to make it easier for users to find \"Nasi Goreng\" in Tangerang.");
				
				System.out.println();
				System.out.println("NasGor created by : ");
				System.out.println(
						"- Vincent Wiranata 2440013664\r\n" + 
						"- Michael Kurniawan 2440020013\r\n" + 
						"- Marvin Fictory 2440014175\r\n" + 
						"- Louis Krisna 2440013494\r\n" + 
						"- Marcello 2440020436");
				
				System.out.println();
				System.out.println("Press Enter to Continue ...");
				iu.nextLine();

			}else if(menu1 == 4) {
				
				//doing Exit 
				clearscreen();
				System.out.println("Thank you !!!");
				iu.nextLine();
				break;	
			}

		} while (true);

	}

	public void clearscreen() {
		for (int i = 0; i < 30; i++) {
			System.out.println();
		}
	}

	public static void main(String[] args) {
		new Main();

	}

}
