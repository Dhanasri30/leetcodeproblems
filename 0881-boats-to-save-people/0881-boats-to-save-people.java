class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0,j=people.length-1;
        int c=0;
        while(i<=j)
        {
            int k=people[i]+people[j];
            if(k<=limit)
            {
                c++;
                i++;
                j--;
            }
            else{
                c++;
                j--;
            }
        }
        return c;
    }
}