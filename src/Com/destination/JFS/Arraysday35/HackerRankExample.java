package Com.destination.JFS.Arraysday35;
import java.util.Scanner;
public class HackerRankExample {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the count of languages");
			int lan=sc.nextInt();
			System.out.println("Enetr the category count in each language");
			int cat=sc.nextInt();
			System.out.println("Enter the movie count in each category");
			int mov=sc.nextInt();
			long total_revenue=0;
			int lan_tmp=0;
			long lang_col;
			
			long arr[][][]=new long[lan][cat][mov];
			long arr_lang[] = new long[lan];
			
			for(int i=0;i<arr.length;i++)  //language
			{
				lang_col=0;
				System.out.println("Inside language number: "+(i+1));
				for(int j=0;j<arr[i].length;j++) //categories
				{
					System.out.println("Inside category number: "+(j+1));
					for(int k=0;k<arr[i][j].length;k++) //MOvies
					{
						System.out.println("Enter the revenue made by movie number:"+(k+1));
						arr[i][j][k]=sc.nextLong();
						total_revenue = total_revenue+arr[i][j][k];
						lang_col=lang_col+arr[i][j][k];
					}
						
					}
					arr_lang[lan_tmp] = lang_col;
					lan_tmp++;
				}
			System.out.println("Displaying the revenue made by each movie produced by Varddhan");
			for(int i=0;i<arr.length;i++)  //language
			{
				System.out.println("Inside language number: "+(i+1));
				for(int j=0;j<arr[i].length;j++) //categories
				{
					System.out.println("Inside category number: "+(j+1));
					for(int k=0;k<arr[i][j].length;k++) //MOvies
					{
						System.out.println(" the revenue made by movie number:"+(k+1)+"is"+arr[i][j][k]);
					}
				}
			}
			System.out.println("-----------------------------");
			System.out.println("Revenue made by all movies is eql to "+total_revenue);
			System.out.println("-----------------------------");
			for(int i=0;i<arr.length;i++) {
				System.out.println("Revenue made by language number "+(i+1)+"is "+arr_lang[i]);
				if(total_revenue>600000000l) {
					System.out.println("vardhan is profitable side ");
					long profit = total_revenue-600000000l;
					System.out.println("The overall profit made is "+(profit));
					if(profit>200000000l) {
						System.out.println("Vardhan is having more profit than previous year");
					}
					else {
						System.out.println("Vardhan is not  having more profit than previous year");
					}
				}
			}


		}

	}


