
package dundermifflin;

import java.util.*;

public class BinarySearch 
{
    
    public int search(ArrayList<Department> deptArray, int key)
    {
        int first = 0;
        int last = deptArray.size() - 1;
        int returnValue = -1;
        
        while ( first <= last)
        {
            int mid = ((first + last )/ 2);
            
            if (key <  deptArray.get(mid).get_Department_ID())
            {
                last = mid -1;
            }
            else if (key > deptArray.get(mid).get_Department_ID())
            {
                first = mid + 1;
            }
            else 
            {
                returnValue = mid;
                return mid;
            }
         
        }
          return -1;
    }
    public int index(int key, ArrayList<Department> deptArray)
    {
        return search(deptArray, key);
    }
    
}
