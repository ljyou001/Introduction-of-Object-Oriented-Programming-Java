import java.util.*;
public class SimpleFraction
{
    public int _num;
    public int _den;

    public SimpleFraction(int num, int den)
    {
        _num = num;
        _den = den;
        coprime();
    }

    public String getType()
    {
        if(_num > _den) {
            return("Improper fraction: " + _num + "/" + _den);
        } else {
            return("Proper fraction: " + _num + "/" + _den);
        }
    }

    public double getValue()
    {
        return (double)(_num) / _den;
    }
    
    public SimpleFraction getReciprocal()
    {
        SimpleFraction invfr = new SimpleFraction(_den, _num);
        return invfr;
    }
    
    public void add(SimpleFraction f)
    {
        this._num *= f._den;
        this._num += f._num * this._den;
        this._den *= f._den;
        coprime();
    }
    
    public void substract(SimpleFraction f)
    {
        this._num *= f._den;
        this._num -= f._num * this._den;
        this._den *= f._den;
        coprime();
    }
    
    public void multiply(SimpleFraction f)
    {
        this._num *= f._num;
        this._den *= f._den;
        coprime();
    }
    
    public void divide(SimpleFraction f)
    {
        this._num += f._den;
        this._den += f._num;
        coprime();
    }
    
    public boolean largerThan(SimpleFraction f)
    {
        if((this._num/this._den) - (f._num/f._den) > 0){
            return true;
        } else {
            return false;
        }
    }
    
    public boolean equalTo(SimpleFraction f)
    {
        if(((double)(this._num)/this._den) == ((double)(f._num)/f._den)){
            return true;
        } else {
            return false;
        }
    }
    
    public String toString()
    {
        return this._num + "/" + this._den;
    }
    
    public boolean isPalindromicPrime()
    {
        int cot = 0;
        int n;
        int i = 1;
        int sum = 0;
        int ind = 0;
        int fDen = this._den; // another int to protect the ._den;
        ArrayList<Integer> arrPrime = new ArrayList<Integer>();
        for(int ct = 2; ct <= this._den/2; ct++)
        {
            if(this._den % ct == 0)
            {
                cot ++;
            }
        }
        if (cot != 0){
            return false;
        }
        for(n = 10; n < this._den; n *= 10)
        {
        }
        for(int m = n; m > 10; m /= 10)
        {
            arrPrime.add(fDen / m);
            ind = (fDen / m) * m;
            fDen -= ind;
        }
        arrPrime.add(fDen);
        int arr[] = new int[arrPrime.size()]; 
        for(int sz = 0 ;sz < arrPrime.size(); sz++)
        {
            arr[sz] = arrPrime.get(sz);
        }
        for(int sm = 0; sm < arr.length; sm++)
        {
            sum += arr[sm];
        }
        if(sum == this._den){
            return true;
        } else {
            return false;
        }
    }
    
    private void coprime()
    {
        for (int i = 2; i <= _num; i++)
        {
            if(_num % i == 0 && _den % i == 0){
                this._num /= i;
                this._den /= i;
                i = 1;
            }
        }
    }
}






















