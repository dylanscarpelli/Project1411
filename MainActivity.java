package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.GridLayout;
import android.widget.TextView;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.graphics.Typeface;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        LinearLayout Wrap = new LinearLayout(this);
        Wrap.setOrientation(LinearLayout.VERTICAL);
        LinearLayout.LayoutParams D = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT);
        Wrap.setLayoutParams(D);

        TextView v = new TextView(this);


        v.setText("Rules void hello1(int hour)");
        v.setBackgroundColor(Color.BLACK);
        v.setGravity(Gravity.CENTER_HORIZONTAL);

        v.setTextSize(11);
        v.setTypeface(null, Typeface.BOLD);
        v.setTextColor(Color.WHITE);


        ViewGroup.LayoutParams lp = new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.WRAP_CONTENT);
        v.setLayoutParams(lp);
        Wrap.addView(v);

        //---------------------------
        GridLayout g1 = new GridLayout(this);
        g1.setRowCount(12);
        g1.setColumnCount(3);
        TextView tv = new TextView(this);
        tv.setText(" name");
        tv.setTypeface(null, Typeface.BOLD);
        GridLayout.Spec row1 = GridLayout.spec(0);
        GridLayout.Spec col2 = GridLayout.spec(1);
        GridLayout.LayoutParams first = new GridLayout.LayoutParams(row1, col2);
        tv.setTextSize(11);
        tv.setTextColor(Color.BLACK);
        tv.setBackgroundColor(Color.WHITE);
        tv.setGravity(Gravity.CENTER_HORIZONTAL);
        first.width = 500;
        first.setMargins(5, 5, 5, 5);
        tv.setLayoutParams(first);
        g1.addView(tv);
        //----------------


        TextView tvP = new TextView(this);
        tvP.setText("Properties");
        tvP.setTypeface(null, Typeface.BOLD);
        GridLayout.Spec row2 = GridLayout.spec(1);
        GridLayout.Spec col1 = GridLayout.spec(0);
        GridLayout.LayoutParams sd = new GridLayout.LayoutParams(row1, col1);
        tvP.setTextSize(11);
        tvP.setTextColor(Color.BLACK);
        tvP.setBackgroundColor(Color.WHITE);
        tvP.setGravity(Gravity.CENTER_VERTICAL);
        sd.width = 200;
        sd.setMargins(5, 5, 5, 5);
        tvP.setLayoutParams(sd);
        g1.addView(tvP);
        //-----------------


        TextView tvD = new TextView(this);
        tvD.setText("Day Hour Classification");
        tvD.setTypeface(null, Typeface.BOLD);
        GridLayout.Spec row3 = GridLayout.spec(2);
        GridLayout.Spec col3 = GridLayout.spec(2);
        GridLayout.LayoutParams thd = new GridLayout.LayoutParams(row1, col3);
        tvD.setTextSize(11);
        tvD.setTextColor(Color.BLACK);
        tvD.setBackgroundColor(Color.WHITE);
        tvD.setGravity(Gravity.CENTER_VERTICAL);
        thd.width = 700;
        thd.setMargins(5, 5, 5, 5);
        tvD.setLayoutParams(thd);
        g1.addView(tvD);
        //---------------


        TextView tvBlank = new TextView(this);
        tvBlank.setText("");
        tvBlank.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams BK = new GridLayout.LayoutParams(row2, col1);
        tvBlank.setTextSize(11);
        tvBlank.setTextColor(Color.BLACK);
        tvBlank.setBackgroundColor(Color.WHITE);
        tvBlank.setGravity(Gravity.CENTER_VERTICAL);
        BK.width = 200;
        BK.setMargins(5, 5, 5, 5);
        tvBlank.setLayoutParams(BK);
        g1.addView(tvBlank);
        //-------------------


        TextView tvBlank1 = new TextView(this);
        tvBlank.setText("");
        tvBlank.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams BK1 = new GridLayout.LayoutParams(row2, col1);
        tvBlank.setTextSize(11);
        tvBlank.setTextColor(Color.BLACK);
        tvBlank.setBackgroundColor(Color.WHITE);
        tvBlank.setGravity(Gravity.CENTER_VERTICAL);
        BK1.width = 200;
        BK1.setMargins(5, 5, 5, 5);
        tvBlank.setLayoutParams(BK1);
        g1.addView(tvBlank1);
        //--------------------


        TextView tvRule = new TextView(this);
        tvRule.setText("Rule");
        tvRule.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams ule = new GridLayout.LayoutParams(row3, col1);
        tvRule.setTextSize(11);
        tvRule.setTextColor(Color.BLACK);
        tvRule.setBackgroundColor(Color.CYAN);
        tvRule.setGravity(Gravity.CENTER_HORIZONTAL);
        ule.width = 200;
        ule.setMargins(5, 5, 5, 5);
        tvRule.setLayoutParams(ule);
        g1.addView(tvRule);
        //--------------------


        TextView tvCategory = new TextView(this);
        tvCategory.setText("Category");
        tvCategory.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams cat = new GridLayout.LayoutParams(row2, col2);
        tvCategory.setTextSize(11);
        tvCategory.setTextColor(Color.BLACK);
        tvCategory.setBackgroundColor(Color.WHITE);
        tvCategory.setGravity(Gravity.CENTER_HORIZONTAL);
        cat.width = 500;
        cat.setMargins(5, 5, 5, 5);
        tvCategory.setLayoutParams(cat);
        g1.addView(tvCategory);
        //--------------------


        TextView tvDateTime = new TextView(this);
        tvDateTime.setText("Day and Time");
        tvDateTime.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams Dtm = new GridLayout.LayoutParams(row2, col3);
        tvDateTime.setTextSize(11);
        tvDateTime.setTextColor(Color.BLACK);
        tvDateTime.setBackgroundColor(Color.WHITE);
        tvDateTime.setGravity(Gravity.CENTER_VERTICAL);
        Dtm.width = 700;
        Dtm.setMargins(5, 5, 5, 5);
        tvDateTime.setLayoutParams(Dtm);
        g1.addView(tvDateTime);
        //--------------------


        TextView tvCO = new TextView(this);
        tvCO.setText("C1");
        tvCO.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams c1 = new GridLayout.LayoutParams(row3, col2);
        tvCO.setTextSize(11);
        tvCO.setTextColor(Color.BLACK);
        tvCO.setBackgroundColor(Color.CYAN);
        tvCO.setGravity(Gravity.CENTER_HORIZONTAL);
        c1.width = 500;
        c1.setMargins(5, 5, 5, 5);
        tvCO.setLayoutParams(c1);
        g1.addView(tvCO);
        //--------------------


        TextView tvAO = new TextView(this);
        tvAO.setText("A1");
        tvAO.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams a1 = new GridLayout.LayoutParams(row3, col3);
        tvAO.setTextSize(11);
        tvAO.setTextColor(Color.BLACK);
        tvAO.setBackgroundColor(Color.CYAN);
        tvAO.setGravity(Gravity.CENTER_HORIZONTAL);
        a1.width = 700;
        a1.setMargins(5, 5, 5, 5);
        tvAO.setLayoutParams(a1);
        g1.addView(tvAO);
        //--------------------


        TextView tvNo = new TextView(this);
        tvNo.setText("");
        tvNo.setTypeface(null, Typeface.BOLD);
        GridLayout.Spec row5 = GridLayout.spec(4);
        GridLayout.LayoutParams Wn = new GridLayout.LayoutParams(row5, col1);
        tvNo.setTextSize(11);
        tvNo.setTextColor(Color.BLACK);
        tvNo.setBackgroundColor(Color.CYAN);
        tvNo.setGravity(Gravity.CENTER_HORIZONTAL);
        Wn.width = 200;
        Wn.setMargins(5, 5, 5, 5);
        tvNo.setLayoutParams(Wn);
        g1.addView(tvNo);
        //--------------------


        TextView tvMinHr = new TextView(this);
        tvMinHr.setText("min <= hour && hour <= max");
        tvMinHr.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams Min = new GridLayout.LayoutParams(row5, col2);
        tvMinHr.setTextSize(10);
        tvMinHr.setTextColor(Color.BLACK);
        tvMinHr.setBackgroundColor(Color.CYAN);
        tvMinHr.setGravity(Gravity.CENTER_HORIZONTAL);
        Min.width = 500;
        Min.setMargins(1, 1, 1, 1);
        tvMinHr.setLayoutParams(Min);
        g1.addView(tvMinHr);
        //--------------------


        TextView tvSystemOut = new TextView(this);
        tvSystemOut.setText("System.out.printIn(greeting+,\"World!\")");
        tvSystemOut.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams Sy = new GridLayout.LayoutParams(row5, col3);
        tvSystemOut.setTextSize(11);
        tvSystemOut.setTextColor(Color.BLACK);
        tvSystemOut.setBackgroundColor(Color.CYAN);
        tvSystemOut.setGravity(Gravity.CENTER_HORIZONTAL);
        Sy.width = 700;
        Sy.setMargins(5, 5, 5, 5);
        tvSystemOut.setLayoutParams(Sy);
        g1.addView(tvSystemOut);

        GridLayout g2 = new GridLayout(this);
        g2.setRowCount(11);
        g2.setColumnCount(4);
        GridLayout.Spec row6 = GridLayout.spec(5);
        GridLayout.Spec row7 = GridLayout.spec(6);
        GridLayout.Spec row8 = GridLayout.spec(7);
        GridLayout.Spec row9 = GridLayout.spec(8);
        GridLayout.Spec row10 = GridLayout.spec(9);
        GridLayout.Spec row11 = GridLayout.spec(10);

        TextView tvRL = new TextView(this);
        tvRL.setText("Rule");
        tvRL.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams RU = new GridLayout.LayoutParams(row6, col1);
        tvRL.setTextSize(11);
        tvRL.setTextColor(Color.BLACK);
        tvRL.setBackgroundColor(Color.WHITE);
        tvRL.setGravity(Gravity.CENTER_VERTICAL);
        RU.width = 200;
        RU.setMargins(5, 5, 5, 5);
        tvRL.setLayoutParams(RU);
        g2.addView(tvRL);
        //-------------------


        TextView tvFrom = new TextView(this);
        tvFrom.setText("From");
        tvFrom.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams Fr = new GridLayout.LayoutParams(row6, col2);
        tvFrom.setTextSize(11);
        tvFrom.setTextColor(Color.BLACK);
        tvFrom.setBackgroundColor(Color.YELLOW);
        tvFrom.setGravity(Gravity.CENTER_VERTICAL);
        Fr.width = 240;
        Fr.setMargins(5, 5, 5, 5);
        tvFrom.setLayoutParams(Fr);
        g2.addView(tvFrom);
        //--------------------


        TextView tvTo = new TextView(this);
        tvTo.setText("To");
        tvTo.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams To = new GridLayout.LayoutParams(row6, col3);
        tvTo.setTextSize(11);
        tvTo.setTextColor(Color.BLACK);
        tvTo.setBackgroundColor(Color.YELLOW);
        tvTo.setGravity(Gravity.CENTER_VERTICAL);
        To.width = 240;
        To.setMargins(5, 5, 5, 5);
        tvTo.setLayoutParams(To);
        g2.addView(tvTo);
        //--------------------


        TextView tvGt = new TextView(this);
        tvGt.setText("Greeting");
        tvGt.setTypeface(null, Typeface.BOLD);
        GridLayout.Spec col4 = GridLayout.spec(3);
        GridLayout.LayoutParams Gng = new GridLayout.LayoutParams(row6, col4);
        tvGt.setTextSize(11);
        tvGt.setTextColor(Color.BLACK);
        tvGt.setBackgroundColor(Color.parseColor("#FF9800"));
        tvGt.setGravity(Gravity.CENTER_VERTICAL);
        Gng.width = 705;
        Gng.setMargins(5, 5, 5, 5);
        tvGt.setLayoutParams(Gng);
        g2.addView(tvGt);
        //--------------------


        TextView tvR10 = new TextView(this);
        tvR10.setText("R10");
        tvR10.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams R1 = new GridLayout.LayoutParams(row7, col1);
        tvR10.setTextSize(11);
        tvR10.setTextColor(Color.BLACK);
        tvR10.setBackgroundColor(Color.WHITE);
        tvR10.setGravity(Gravity.CENTER_VERTICAL);
        R1.width = 200;
        R1.setMargins(5, 5, 5, 5);
        tvR10.setLayoutParams(R1);
        g2.addView(tvR10);
        //--------------------


        TextView tvR20 = new TextView(this);
        tvR20.setText("R20");
        tvR20.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams R2 = new GridLayout.LayoutParams(row8, col1);
        tvR20.setTextSize(11);
        tvR20.setTextColor(Color.BLACK);
        tvR20.setBackgroundColor(Color.WHITE);
        tvR20.setGravity(Gravity.CENTER_VERTICAL);
        R2.width = 200;
        R2.setMargins(5, 5, 5, 5);
        tvR20.setLayoutParams(R2);
        g2.addView(tvR20);
        //--------------------


        TextView tvR30 = new TextView(this);
        tvR30.setText("R30");
        tvR30.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams R3 = new GridLayout.LayoutParams(row9, col1);
        tvR30.setTextSize(11);
        tvR30.setTextColor(Color.BLACK);
        tvR30.setBackgroundColor(Color.WHITE);
        tvR30.setGravity(Gravity.CENTER_VERTICAL);
        R3.width = 200;
        R3.setMargins(5, 5, 5, 5);
        tvR30.setLayoutParams(R3);
        g2.addView(tvR30);
        //--------------------


        TextView tvR40 = new TextView(this);
        tvR40.setText("R40");
        tvR40.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams R4 = new GridLayout.LayoutParams(row10, col1);
        tvR40.setTextSize(11);
        tvR40.setTextColor(Color.BLACK);
        tvR40.setBackgroundColor(Color.WHITE);
        tvR40.setGravity(Gravity.CENTER_VERTICAL);
        R4.width = 200;
        R4.setMargins(5, 5, 5, 5);
        tvR40.setLayoutParams(R4);
        g2.addView(tvR40);
        //--------------------


        TextView tvZe = new TextView(this);
        tvZe.setText("0");
        tvZe.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams zero = new GridLayout.LayoutParams(row7, col2);
        tvZe.setTextSize(11);
        tvZe.setTextColor(Color.BLACK);
        tvZe.setBackgroundColor(Color.YELLOW);
        tvZe.setGravity(Gravity.CENTER_VERTICAL | Gravity.RIGHT);
        zero.width = 240;
        zero.setMargins(5, 5, 5, 5);
        tvZe.setLayoutParams(zero);
        g2.addView(tvZe);
        //--------------------


        TextView tvTw = new TextView(this);
        tvTw.setText("12");
        tvTw.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams Twelve = new GridLayout.LayoutParams(row8, col2);
        tvTw.setTextSize(11);
        tvTw.setTextColor(Color.BLACK);
        tvTw.setBackgroundColor(Color.YELLOW);
        tvTw.setGravity(Gravity.CENTER_VERTICAL | Gravity.RIGHT);
        Twelve.width = 240;
        Twelve.setMargins(5, 5, 5, 5);
        tvTw.setLayoutParams(Twelve);
        g2.addView(tvTw);
        //--------------------


        TextView tvEt = new TextView(this);
        tvEt.setText("18");
        tvEt.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams Eit = new GridLayout.LayoutParams(row9, col2);
        tvEt.setTextSize(11);
        tvEt.setTextColor(Color.BLACK);
        tvEt.setBackgroundColor(Color.YELLOW);
        tvEt.setGravity(Gravity.CENTER_VERTICAL | Gravity.RIGHT);
        Eit.width = 240;
        Eit.setMargins(5, 5, 5, 5);
        tvEt.setLayoutParams(Eit);
        g2.addView(tvEt);
        //--------------------


        TextView tvTT = new TextView(this);
        tvTT.setText("22");
        tvTT.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams TwT = new GridLayout.LayoutParams(row10, col2);
        tvTT.setTextSize(11);
        tvTT.setTextColor(Color.BLACK);
        tvTT.setBackgroundColor(Color.YELLOW);
        tvTT.setGravity(Gravity.CENTER_VERTICAL | Gravity.RIGHT);
        TwT.width = 240;
        TwT.setMargins(5, 5, 5, 5);
        tvTT.setLayoutParams(TwT);
        g2.addView(tvTT);
        //--------------------


        TextView tvOO = new TextView(this);
        tvOO.setText("11");
        tvOO.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams El = new GridLayout.LayoutParams(row7, col3);
        tvOO.setTextSize(11);
        tvOO.setTextColor(Color.BLACK);
        tvOO.setBackgroundColor(Color.YELLOW);
        tvOO.setGravity(Gravity.CENTER_VERTICAL | Gravity.RIGHT);
        El.width = 240;
        El.setMargins(5, 5, 5, 5);
        tvOO.setLayoutParams(El);
        g2.addView(tvOO);
        //--------------------


        TextView tvST = new TextView(this);
        tvST.setText("17");
        tvST.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams Stn = new GridLayout.LayoutParams(row8, col3);
        tvST.setTextSize(11);
        tvST.setTextColor(Color.BLACK);
        tvST.setBackgroundColor(Color.YELLOW);
        tvST.setGravity(Gravity.CENTER_VERTICAL | Gravity.RIGHT);
        Stn.width = 240;
        Stn.setMargins(5, 5, 5, 5);
        tvST.setLayoutParams(Stn);
        g2.addView(tvST);
        //--------------------


        TextView tvSvg = new TextView(this);
        tvSvg.setText("21");
        tvSvg.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams twn = new GridLayout.LayoutParams(row9, col3);
        tvSvg.setTextSize(11);
        tvSvg.setTextColor(Color.BLACK);
        tvSvg.setBackgroundColor(Color.YELLOW);
        tvSvg.setGravity(Gravity.CENTER_VERTICAL | Gravity.RIGHT);
        twn.width = 240;
        twn.setMargins(5, 5, 5, 5);
        tvSvg.setLayoutParams(twn);
        g2.addView(tvSvg);
        //--------------------


        TextView Tee = new TextView(this);
        Tee.setText("23");
        Tee.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams Three = new GridLayout.LayoutParams(row10, col3);
        Tee.setTextSize(11);
        Tee.setTextColor(Color.BLACK);
        Tee.setBackgroundColor(Color.YELLOW);
        Tee.setGravity(Gravity.CENTER_VERTICAL | Gravity.RIGHT);
        Three.width = 240;
        Three.setMargins(5, 5, 5, 5);
        Tee.setLayoutParams(Three);
        g2.addView(Tee);
        //--------------------


        TextView tvGM = new TextView(this);
        tvGM.setText("Good Morning");
        tvGM.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams GoM = new GridLayout.LayoutParams(row7, col4);
        tvGM.setTextSize(11);
        tvGM.setTextColor(Color.BLACK);
        tvGM.setBackgroundColor(Color.parseColor("#FF9800"));
        tvGM.setGravity(Gravity.CENTER_VERTICAL);
        GoM.width = 705;
        GoM.setMargins(5, 5, 5, 5);
        tvGM.setLayoutParams(GoM);
        g2.addView(tvGM);
        //--------------------


        TextView tvGA = new TextView(this);
        tvGA.setText("Good Afternoon");
        tvGA.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams GoA = new GridLayout.LayoutParams(row8, col4);
        tvGA.setTextSize(11);
        tvGA.setTextColor(Color.BLACK);
        tvGA.setBackgroundColor(Color.parseColor("#FF9800"));
        tvGA.setGravity(Gravity.CENTER_VERTICAL);
        GoA.width = 705;
        GoA.setMargins(5, 5, 5, 5);
        tvGA.setLayoutParams(GoA);
        g2.addView(tvGA);
        //--------------------


        TextView tvGE = new TextView(this);
        tvGE.setText("Good Evening");
        tvGE.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams GoE = new GridLayout.LayoutParams(row9, col4);
        tvGE.setTextSize(11);
        tvGE.setTextColor(Color.BLACK);
        tvGE.setBackgroundColor(Color.parseColor("#FF9800"));
        tvGE.setGravity(Gravity.CENTER_VERTICAL);
        GoE.width = 705;
        GoE.setMargins(5, 5, 5, 5);
        tvGE.setLayoutParams(GoE);
        g2.addView(tvGE);
        //--------------------


        TextView tvGN = new TextView(this);
        tvGN.setText("Good Night");
        tvGN.setTypeface(null, Typeface.BOLD);
        GridLayout.LayoutParams GoN = new GridLayout.LayoutParams(row10, col4);
        tvGN.setTextSize(11);
        tvGN.setTextColor(Color.BLACK);
        tvGN.setBackgroundColor(Color.parseColor("#FF9800"));
        tvGN.setGravity(Gravity.CENTER_VERTICAL);
        GoN.width = 705;
        GoN.setMargins(5, 5, 5, 5);
        tvGN.setLayoutParams(GoN);
        g2.addView(tvGN);
        //--------------------


        Wrap.addView(g1);
        Wrap.addView(g2);

        setContentView(Wrap);

    }


}
