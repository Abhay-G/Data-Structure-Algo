/*
class pair
{
	int first;
	int second;
	pair(int first, int second)
	{
		this.first = first;
		this.second = second;
	}
}
*/

class Sol
{
    public static ArrayList<pair> overlappedInterval(ArrayList<pair> arr, int n) 
    {
       // code here
       if(arr.size()==1)
       {
           return arr;
       }
       
       Collections.sort(arr, new Comparator<pair>(){
           
           public int compare(pair p1, pair p2)
           {
               return p1.first-p2.first;
           }
           });
          
          int i = 0;
          while(i<arr.size()-1)
          {
              if(arr.get(i+1).first>arr.get(i).second)
              {
                  i++;
              }
              else if(arr.get(i+1).first<=arr.get(i).second)
              {
                  arr.get(i).first = Math.min(arr.get(i).first, arr.get(i+1).first);
                  arr.get(i).second = Math.max(arr.get(i).second, arr.get(i+1).second);
                  
                  arr.remove(i+1);
              }
          }
          return arr;
    }

}
