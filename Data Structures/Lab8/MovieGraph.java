import java.util.*;
import java.io.*;
public class MovieGraph {
	
		// the GraphType is String because both movies and cast are all strings
		
		GraphType<String> movieGraph;
		HashSet<String> movies;
		HashSet<String> cast;
		String fileName;
	
		
		public MovieGraph() {
			
			 movieGraph = new GraphType<>();
			 cast = new HashSet<>();
			 movies = new HashSet<>();
			 fileName="movies.txt";
			 
		}
		
		public void numMovies() {
			System.out.println(movies.size());
		}
		
		public void numCast() {
			System.out.println(cast.size());
		}
		
		public void moviesList(String cm) {
			System.out.println (movieGraph.graph.get(cm));
		}
		
		public ArrayList <String> commonMovies(ArrayList<String> al1, ArrayList<String> al2) {
			ArrayList <String> common = new ArrayList<String>();
			for (String s: al1)
				if (al2.contains(s))
					common.add(s);
			return common;
		}
		
		public void coCast (int minMovies) {
			ArrayList<String> castMin = new ArrayList<>();
			for (String s: cast)
				if (movieGraph.graph.get(s).size() >= minMovies)
					castMin.add(s); 
			for (String p: castMin)
					for (String r: castMin) {
						if (p.compareTo(r)<0) {
							// intersect the arrayList of movies featuring p and r
							ArrayList<String> al = commonMovies(movieGraph.graph.get(p), movieGraph.graph.get(r));
							if (al.size() >= minMovies) {
								System.out.println( "Cast members are " + p + " and " + r);
								System.out.println(al);
								System.out.println();
							}
					}
				}
			
		}
		
		public static void main (String [] args) {
			MovieGraph mg = new MovieGraph();
			mg.readMovieInfo();
			mg.moviesList("Cruise, Tom");
			mg.numMovies();
			mg.numCast();
			//15 is the maximum number
			mg.coCast(13);
		}
		public void readMovieInfo () {
			Scanner fileScanner;
			String line; 
			  try
              {
                  fileScanner = new Scanner (new File (fileName));
                  while (fileScanner.hasNext()) {
                   line = fileScanner.nextLine();
                   String[] movieInfo = line.split("/");
                   String movieName = movieInfo[0];
                   movies.add(movieName);
                   movieGraph.addVertex(movieName);
                   for (int i=1; i<movieInfo.length;i++) {
                	   String cm = movieInfo[i];
                	   
                	   if (!cast.contains(cm)) {
                	   movieGraph.addVertex(cm);
                	   cast.add(cm);
                	   
                	   }
                	   movieGraph.addEdge(cm, movieName);
                	   
                	   
                   }
          
                   

                   }
		}
			  catch (IOException e)
              {
                  System.out.println(e);
              } //catch
	
		}
		
		//Questions and Answers
		
		// Question 9 
		// 4188
		
		//Question 10
		// 115241
		
		//Question 11
		// 202927
		
		//Question 12- printed below for Cruise, Tom
		
	// Question 14
//		Cast members are Lynn, Sherry (I) and McGowan, Mickie
//		[Aladdin (1992), American Tail: Fievel Goes West, An (1991), Beauty and the Beast (1991), Brother Bear (2003), Bug's Life, A (1998), Emperor's New Groove, The (2000), Hercules (1997), Iron Giant, The (1999), Kurenai no buta (1992), Monsters, Inc. (2001), Osmosis Jones (2001), Sen to Chihiro no kamikakushi (2001), Toy Story (1995), Toy Story 2 (1999), Treasure Planet (2002)]
//
//		Cast members are Lynn, Sherry (I) and Proctor, Phil
//		[Aladdin (1992), Beauty and the Beast (1991), Brother Bear (2003), Bug's Life, A (1998), Hercules (1997), Iron Giant, The (1999), Kurenai no buta (1992), Monsters, Inc. (2001), Sen to Chihiro no kamikakushi (2001), Tarzan (1999), Toy Story (1995), Toy Story 2 (1999), Treasure Planet (2002)]
//
//		Cast members are Kahan, Steve and Tuerpe, Paul
//		[16 Blocks (2006), Assassins (1995), Conspiracy Theory (1997), Free Willy 2: The Adventure Home (1995), Lethal Weapon (1987), Lethal Weapon 2 (1989), Lethal Weapon 3 (1992), Lethal Weapon 4 (1998), Maverick (1994), Radio Flyer (1992), Scrooged (1988), Superman (1978), Timeline (2003), Toy, The (1982)]
//
//		Cast members are Breslau, Susan and Zucker, Charlotte
//		[Airplane! (1980), First Knight (1995), Ghost (1990), High School High (1996), Kentucky Fried Movie, The (1977), My Best Friend's Wedding (1997), My Boss's Daughter (2003), My Life (1993 I), Naked Gun 2½: The Smell of Fear, The (1991), Naked Gun 33 1 3: The Final Insult (1994), Naked Gun: From the Files of Police Squad!, The (1988), Rat Race (2001), Ruthless People (1986), Top Secret! (1984)]
//
//		Cast members are McGowan, Mickie and Proctor, Phil
//		[Aladdin (1992), Beauty and the Beast (1991), Brother Bear (2003), Bug's Life, A (1998), Hercules (1997), Home on the Range (2004), Iron Giant, The (1999), Kurenai no buta (1992), Monsters, Inc. (2001), Sen to Chihiro no kamikakushi (2001), Toy Story (1995), Toy Story 2 (1999), Treasure Planet (2002)]
//
//		Cast members are Covert, Allen and Sandler, Adam (I)
//		[50 First Dates (2004), Airheads (1994), Anger Management (2003), Big Daddy (1999 I), Bulletproof (1996), Eight Crazy Nights (2002), Going Overboard (1989), Happy Gilmore (1996), Little Nicky (2000), Longest Yard, The (2005), Mr. Deeds (2002), Waterboy, The (1998), Wedding Singer, The (1998)]
//
//		Cast members are Darling, Jennifer and McGowan, Mickie
//		[Aladdin (1992), American Tail: Fievel Goes West, An (1991), Beauty and the Beast (1991), Brother Bear (2003), Bug's Life, A (1998), Emperor's New Groove, The (2000), Hercules (1997), Iron Giant, The (1999), Kurenai no buta (1992), Lilo & Stitch (2002), Little Mermaid, The (1989), Monsters, Inc. (2001), Sen to Chihiro no kamikakushi (2001), Treasure Planet (2002)]
//
//		Cast members are Angel, Jack (I) and Lynn, Sherry (I)
//		[Aladdin (1992), American Tail: Fievel Goes West, An (1991), Beauty and the Beast (1991), Bug's Life, A (1998), Hercules (1997), Iron Giant, The (1999), Kurenai no buta (1992), Monsters, Inc. (2001), Sen to Chihiro no kamikakushi (2001), Tarzan (1999), Toy Story (1995), Toy Story 2 (1999), Treasure Planet (2002)]
//
//		Cast members are Angel, Jack (I) and McGowan, Mickie
//		[Aladdin (1992), American Tail: Fievel Goes West, An (1991), Beauty and the Beast (1991), Bug's Life, A (1998), Hercules (1997), Iron Giant, The (1999), Kurenai no buta (1992), Lilo & Stitch (2002), Little Mermaid, The (1989), Monsters, Inc. (2001), Sen to Chihiro no kamikakushi (2001), Toy Story (1995), Toy Story 2 (1999), Treasure Planet (2002)]

	// Question 15
		// Cast members are Lynn, Sherry (I) and McGowan, Mickie
		// [Aladdin (1992), American Tail: Fievel Goes West, An (1991), Beauty and the Beast (1991), Brother Bear (2003), Bug's Life, A (1998), Emperor's New Groove, The (2000), Hercules (1997), Iron Giant, The (1999), Kurenai no buta (1992), Monsters, Inc. (2001), Osmosis Jones (2001), Sen to Chihiro no kamikakushi (2001), Toy Story (1995), Toy Story 2 (1999), Treasure Planet (2002)]
		
}
