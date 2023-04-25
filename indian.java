import java.util.*;

public class indian {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int t = scanner.nextInt();
while (t-- > 0) {
long k = scanner.nextLong();
long lo = 1, hi = Long.MAX_VALUE;
while (lo < hi) {
long mid = lo + (hi - lo) / 2;
long count = getCount(mid);
if (count < k) {
lo = mid + 1;
} else {
hi = mid;
}
}
long index = k - getCount(lo - 1);
long ans = getNumber(lo, index);
System.out.println(ans);
}
}
}
