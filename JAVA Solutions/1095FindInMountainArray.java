/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *   public int get(int index) {}
 *   public int length() {}
 * }
 */

class Solution {
  public int findInMountainArray(int target, MountainArray mountainArr) {
    final int n = mountainArr.length();
    final int peakIndex = peakIndexInMountainArray(mountainArr, 0, n - 1);

    final int leftIndex = searchLeft(mountainArr, target, 0, peakIndex);
    if (mountainArr.get(leftIndex) == target)
      return leftIndex;

    final int rightIndex = searchRight(mountainArr, target, peakIndex + 1, n - 1);
    if (mountainArr.get(rightIndex) == target)
      return rightIndex;

    return -1;
  }

  // 852. Peak Index in a Mountain Array
  private int peakIndexInMountainArray(MountainArray A, int l, int r) {
    while (l < r) {
      final int m = (l + r) / 2;
      if (A.get(m) < A.get(m + 1))
        l = m + 1;
      else
        r = m;
    }
    return l;
  }

  private int searchLeft(MountainArray A, int target, int l, int r) {
    while (l < r) {
      final int m = (l + r) / 2;
      if (A.get(m) < target)
        l = m + 1;
      else
        r = m;
    }
    return l;
  }

  private int searchRight(MountainArray A, int target, int l, int r) {
    while (l < r) {
      final int m = (l + r) / 2;
      if (A.get(m) > target)
        l = m + 1;
      else
        r = m;
    }
    return l;
  }
}

// SECOND SOLUTION
/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int maxIndex = getMaxValueIndex(mountainArr);
    int res = find(target, mountainArr, 0, maxIndex + 1, true);
    if (res == -1) {
        res = find(target, mountainArr, maxIndex, mountainArr.length(), false);
    }
    return res;
}

int getMaxValueIndex(MountainArray mountainArr) {
    int n = mountainArr.length();
    int l = 0, r = n;
    while (l < r) {
        int mid = (l + r) >>> 1;
        int m = mountainArr.get(mid);
        int left = mid > 0 ? mountainArr.get(mid - 1) : -1;
        int right = mid + 1 < n ? mountainArr.get(mid + 1) : -1;
        if (left == -1) {
            return m > right ? 0 : 1;
        } else if (right == -1) {
            return m > left ? n - 1 : n - 2;
        } else if (m > left && m < right) {
            l = mid + 1;
        } else if (m < left && m > right) {
            r = mid;
        } else if (m > left && m > right) {
            return mid;
        }
    }
    return 0;
}

int find(int target, MountainArray mountainArr, int l, int r, boolean left) {
    while (l < r) {
        int mid = (l + r) >>> 1;
        int m = mountainArr.get(mid);
        if (m > target) {
            if (left) {
                r = mid;
            } else {
                l = mid + 1;
            }
        } else if (m < target) {
            if (left) {
                l = mid + 1;
            } else {
                r = mid;
            }
        } else {
            return mid;
        }
    }
    return -1;
    }
}