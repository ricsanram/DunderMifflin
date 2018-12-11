/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dundermifflin;

import java.util. *;

public class SortByID  implements Comparator<Department>
{
    public int compare( Department a , Department b)
    {
        return a.id - b.id;
    }
}
