//It's not the whole code but the function to find it.

static long inversionCount(long arr[], long N)
    {
        if(N==1)
        {
            return 0;
        }
        long inv = 0;
        inv = mergeSort(arr,0,(int)(N-1));
        return inv;
    }
    
    static long mergeSort(long arr[], int l, int r)
    {
        long inv = 0;
        if(l<r)
        {
          int mid = (l+r)/2;
          
          inv+= mergeSort(arr,l,mid);
          inv+= mergeSort(arr,mid+1,r);
          inv+= mergeAndCount(arr,mid,l,r);
        }
        return inv;
    }
    static long mergeAndCount(long arr[],int mid, int l, int r)
    {
        int n = mid-l+1;
        int m = r-mid;
        long left[] = new long[n];
        long right[] = new long[m];
        for(int i=0;i<n;i++)
        {
            left[i] = arr[l+i];
        }
        for(int j=0;j<m;j++)
        {
            right[j] = arr[mid+1+j];
        }
        
        long inv = 0;
        int i,j,k;
        i=j=0;
        k=l;
        while(i<n&&j<m)
        {
            if(left[i]<=right[j])
            {
                arr[k] = left[i];
                i++;
            }
            else if(left[i]>right[j])
            {
                inv += n-i;
                arr[k] = right[j];
                j++;
            }
            k++;
        }
        while(i<n)
        {
            arr[k] = left[i];
            k++;
            i++;
        }
        while(j<m)
        {
            arr[k] = right[j];
            k++;
            j++;
        }
        return inv;
    }
