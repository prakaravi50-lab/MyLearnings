package practicefiles;

public class ConstructorOverloading {

    double width,height,depth;

   ConstructorOverloading()
    {
        width=height=depth=0;
    }


    ConstructorOverloading(double w,double h, double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    ConstructorOverloading(double len)
    {
        width=height=depth=len;
    }

    double vol()
    {
        return(width*height*depth);
    }

}
