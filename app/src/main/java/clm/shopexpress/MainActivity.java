package clm.shopexpress;


import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<myShoe> allShoes;
    int index;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        allShoes=new ArrayList<>();

        allShoes.add(new myShoe("Nike",R.drawable.nike));
        allShoes.add(new myShoe("Reebok",R.drawable.reebok));
        allShoes.add(new myShoe("Addidas",R.drawable.adidas));
        allShoes.add(new myShoe("NewBallance",R.drawable.nb));




        FragmentManager manager= getFragmentManager();

        shoes shoeFrag = shoes.newInstance("nike",R.drawable.shoes);

        FragmentTransaction transaction= manager.beginTransaction();
        transaction.replace(R.id.detailsContainer,shoeFrag);
        transaction.commit();

        cart cartFrag = cart.newInstance("");
        transaction= manager.beginTransaction();
        transaction.replace(R.id.cartContainer,cartFrag);
        transaction.commit();

        Button nextBTN=(Button) findViewById(R.id.fwdBTN);
        nextBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /// forward -- > next allShoes
            }
        });





    }
}
