package com.company;


public class HorseBarn {
    private Horse[] spaces;

    public HorseBarn(Horse[] spaces)
    {
        this.spaces = spaces;
    }

    public int findHorseSpace(String name)
    {
        for (int i = 0; i < this.spaces.length; i ++)
        {
            if(this.spaces[i] != null && name.equals(this.spaces[i].getName()))
            {
                return i;
            }
        }
        return -1;
    }

    public String toString()
    {
        String barnString = "";
        for(int i = 0; i < this.spaces.length; i ++)
        {
            barnString += i + ". " + this.spaces[i].getName() + ", " + this.spaces[i].getWeight();
        }
        return barnString;
    }

    public void consolidate()
    {
        for (int i = 0; i < this.spaces.length-1; i ++)
        {
            if (this.spaces[i] == null)
            {
                for (int j = i+1; j < this.spaces.length; j++)
                {
                    this.spaces[i] = this.spaces[j];
                    this.spaces[j] = null;
                    j = this.spaces.length;
                }
            }
        }
    }
}
