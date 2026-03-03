public class ArrayManipulator
{
    private int[] nums;
    private String[] words;

    public ArrayManipulator(int[] nums, int howManyStrings)
    {
        this.nums = nums;
        words = new String[howManyStrings];
    }

    public int getNumsMiddleIndex()
    {
        if (nums.length % 2 == 0)
        {
            return nums[nums.length / 2 - 1];
        }
        else
        {
            return  nums[nums.length / 2];
        }
    }

    public double getNumsAverage()
    {
        return (nums[0] + nums[nums.length - 1] + nums[getNumsMiddleIndex()])/3.0;
    }

    public boolean sameLengths()
    {
        return nums.length == words.length;
    }

    public boolean updateWordsListAt(int idx, String newValue)
    {
        if (idx < words.length & idx >= 0)
        {
            words[idx] = newValue;
            return true;
        }
        else
        {
            return false;
        }
    }



    /** Returns the number of characters that are contained in the last element of
     *  the words list; however, if the last element of the array is null return 0
     *
     *  @return  how many characters are in the last element of words; 0 if the
     *           last element is null
     */
    public int howLongLastWord()
    { /* implement this method */ }


    /** Returns the int in the nums array located at the specified index
     *  PRECONDITION:  assume idx < length of nums
     *
     *  @return  the int in the nums array located at index idx
     */
    public int getNumAt(int idx) {
        /* implement this method */
    }


    /** Returns the String in the words array located at the specified index
     *  PRECONDITION:  assume idx < length of words
     *
     *  @return  the int in the nums array located at index idx
     */
    public String getWordAt(int idx)
    {
        /* implement this method */

    }

