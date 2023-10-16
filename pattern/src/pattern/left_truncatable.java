package pattern;

public class left_truncatable {
	
	public static boolean  LeftTruncatablePrimes(int n)
	{
		int temp = n, cnt = 0, temp1;
		while (temp != 0)
		{
			cnt++;
	
			temp1 = temp%10;
			if (temp1 == 0)
				return false;
			temp = temp/10;
		}
	
		boolean isPrime[] = new boolean[n+1];
		sieveOfEratosthenes(n, isPrime);
		for (int i = cnt; i > 0; i--)
		{
			int mod = power(10,i);
	
			if (!isPrime[n%mod])
				return false;
		}
		return true;
	}
	
	
	public static int power(int x,int y)
	{
		if (y == 0)
			return 1;
		else if (y%2 == 0)
			return power(x, y/2)
				*power(x, y/2);
		else
			return x*power(x, y/2)
				*power(x, y/2);
	}
	public static void sieveOfEratosthenes
				(int n, boolean isPrime[])
	{
		isPrime[0] = isPrime[1] = false;
		for (int i = 2; i <= n; i++)
			isPrime[i] = true;
	
		for (int p = 2; p*p <= n; p++)
		{
			if (isPrime[p] == true)
			{
				for (int i = p*2; i <= n; i += p)
					isPrime[i] = false;
			}
		}
	}
	
	
	
	public static void main(String args[])
	{
		int n = 9137;
	
		if ( LeftTruncatablePrimes(n))
			System.out.println
				("Yes "+ n +" is left truncatable prime");
		else
			System.out.println
				("No "+ n + " is not left truncatable prime");
	}

}
