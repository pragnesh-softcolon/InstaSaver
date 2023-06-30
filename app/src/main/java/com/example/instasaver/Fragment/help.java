package com.example.instasaver.Fragment;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import com.example.instasaver.R;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;


public class help extends Fragment {
    View view;
    TextInputEditText feedback;
    RatingBar ratingBar;
    Button send;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_help, container, false);
        feedback=view.findViewById(R.id.feedback);
        ratingBar=view.findViewById(R.id.Rbar);
        send=view.findViewById(R.id.send);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
//                Toast.makeText(getContext(), "Select Gamil App for Feedback", Toast.LENGTH_LONG).show();
                String rating=String.valueOf(ratingBar.getRating());
                String Feedback=feedback.getText().toString();
                String Finel_Feedback=Feedback+"\n"+"Rating : "+rating;
                String whatsappUrl = "https://api.whatsapp.com/send?phone="+"+918128274881"+"&text="+Finel_Feedback;
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(whatsappUrl));
                startActivity(intent);


//                Intent email = new Intent(Intent.ACTION_SEND);
//                  email.putExtra(Intent.EXTRA_EMAIL, new String[]
//                          { "pragnesh.softcolon@gmail.com"});
//                  email.putExtra(Intent.EXTRA_SUBJECT, "Feedback Of Insta-saver App");
//                  email.putExtra(Intent.EXTRA_TEXT, Finel_Feedback);
//                  //need this to prompts email client only
//                  email.setType("message/rfc822");
//                  startActivity(Intent.createChooser(email, "Choose an Email client :"));

            }
        });
        return view;
    }
}