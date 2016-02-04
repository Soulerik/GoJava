public class Sheiker
    {

        public static void main(String[] args)
        {
            int[] array = new int[10];
            for (int j = 0; j < array.length; j++){
                array[j] = (int)(Math.random() * 100);

            }
            for (int i : array) System.out.print(i + " ");
            System.out.println("");
            
            int left = 0;
            int right = array.length - 1;
            int temp = 0;
            do
            {
                for (int i = left; i < right; i++)
                {
                    if(array[i] > array[i+1])
                    {
                        temp = array[i];
                        array[i] = array[i+1];
                        array[i+1] = temp;
                    }
                }
                right--;
                for (int i = right; i > left ; i--)
                {
                    if(array[i] < array[i-1])
                    {
                        temp = array[i-1];
                        array[i-1] = array[i];
                        array[i] = temp;
                    }
                }
                left++;
            } while (left <= right);

            for (int i : array) System.out.print(i + " ");
        }
    }
