package br.com.dennisbeauty.mobile.myapplication.Activities;

import android.support.design.widget.TabLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import br.com.dennisbeauty.mobile.myapplication.Models.Agenda;
import br.com.dennisbeauty.mobile.myapplication.R;

public class MainActivity extends AppCompatActivity {


    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager viewPager ;

    private void setupViewPager (ViewPager mViewPager){
       SectionsPagerAdapter sectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
       sectionsPagerAdapter.addFragment(new AgendarServicosActivity() , "Agendar Servicos");
       sectionsPagerAdapter.addFragment(new MinhaContaActitivty() , "Minha Conta");
       sectionsPagerAdapter.addFragment(new MeusAgendamentosActitivty() , "Meus Agendamentos");

       mViewPager.setAdapter(sectionsPagerAdapter);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

       viewPager = (ViewPager) findViewById(R.id.container);
       setupViewPager(viewPager);

       TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
       tabLayout.setupWithViewPager(viewPager);

    }



    public class SectionsPagerAdapter extends FragmentPagerAdapter {


        private final List<Fragment> mfragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }


        public void addFragment (Fragment fragment, String title){
            mfragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }

        @Override
        public Fragment getItem(int position) {
           return mfragmentList.get(position);

        }



        @Override
        public int getCount() {

            return mfragmentList.size();
        }
    }

    }
