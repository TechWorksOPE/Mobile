package br.com.dennisbeauty.mobile.myapplication.Activities;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.lang.reflect.AnnotatedElement;

import br.com.dennisbeauty.mobile.myapplication.R;

/**
 * Created by willy on 16/04/2018.
 */

public class AgendarServicosActivity extends android.support.v4.app.Fragment{

    public AgendarServicosActivity(){}

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.agendar_servicos, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        return rootView;

    }

    public static AgendarServicosActivity newInstance (){
        AgendarServicosActivity fragment = new AgendarServicosActivity();
        return fragment;

    }


//              intent.putExtra("Agendamento" , agendamento.toString());
    //            intent.putExtra("Mensagem" , mensagem );




}
