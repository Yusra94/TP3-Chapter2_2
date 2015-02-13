package za.ac.cput.project2;

/**
 * Created by student on 2015/02/12.
 */
public class ItemInfo {

    private int itemNo;
    private String description;
    private float price;

    public ItemInfo()
    {

    }

    public void setItemNo(int num)
    {
        itemNo = num;
    }

    public void setDescription(String desc)
    {
        description = desc;
    }


    public void setPrice(float p)
    {
        price = p;
    }

    public int getItemNo()
    {
        return itemNo;
    }

    public String getDescription()
    {
        return description;
    }

    public float getPrice()
    {
        return price;
    }
}
