package com.kasako.porker;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.InputFilter;
import android.widget.TextView;


public class tutorial extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tutorial);

        TextView txt=(TextView)findViewById(R.id.text);
//        txt.setFilters(new InputFilter[] {new MyFilter(txt)});
        txt.setTextColor(Color.BLACK);

        String text = "\n" +
                "\n" +
                "人数\n"+
                "\n"+
                "2～6人\n" +
                "\n" +
                "\n" +
                "使用カード\n" +
                "\n" +
                "ジョーカーを除く52枚、チップもしくはそれに代わるもの\n" +
                "\n" +
                "\n" +
                "親の決め方\n" +
                "\n" +
                "仮の親が、よく切ったカードを左側の人から順に、1枚ずつ表向きに配ります。\n" +
                "最初にJのカードを配られた人がゲームの親になり、以後右まわりに親をつとめます。\n" +
                "\n" +
                "\n" +
                "目的\n" +
                "\n" +
                "より強いポーカー・ハンド(役)をつくる。\n" +
                "※カードの強い順位は、A・K・Q・J・10……2　スートの強い順位は、♠・♥・♦・♣\n" +
                "　同じ役を持った人が何人もいる場合は、まずカードの順位の高い方を勝ちとし、\n" +
                "※それも同じ場合はスートの順位の高い方を勝ちとします。\n" +
                "\n" +
                "\n" +
                "ポーカー・ハンド（役）\n" +
                "\n" +
                "\n" +
                "強い順に説明します。\n" +
                "\n" +
                "\n" +
                "1．ロイヤルストレートフラッシュ\n" +
                "\n" +
                "同種札で数字が1番高い順位にそろったもので、\n" +
                "10・J・Q・K・Aとなります。\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2．ストレート・フラッシュ\n" +
                "\n" +
                "同種札で数字が順番に並んでいるものです。但し……K・A・2……とは続きません。\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "3．フォア・カード\n" +
                "\n" +
                "同位札が4枚そろったものです。\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "4．フルハウス\n" +
                "\n" +
                "同位札が3枚と、同位札が2枚の役です。同じ役同士では3枚組で比較し、順位の高い方が勝ちです。\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "5．フラッシュ\n" +
                "\n" +
                "同種札が5枚そろったものです。\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "6．ストレート\n" +
                "\n" +
                "スートの種類に関係なく、\n" +
                "5枚のカードの数字が続いているものです。\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "7．スリーカード\n" +
                "\n" +
                "同位札が3枚そろったものです。\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "8．ツウ・ペア\n" +
                "\n" +
                "2枚ずつの同位札が2組。同じ役同士では高い方のペアを比較して、順位の高い方が勝ち。それも同じなら低い方のペアを比較して、順位の高い方が勝ち。またそれも同じなら、高い方のペアで♠を持っている人が勝ちとなります。\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "9．ワン・ペア\n" +
                "\n" +
                "同位札が2枚そろったもの。同じ役同志ではペアを比較して、順位の高い方が勝ち。それも同じなら、ペアの中で♠を持ってる人が勝ちとなります。\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "用語の説明\n" +
                "\n" +
                "\n" +
                "ビッド\n" +
                "チップを出すことです。 \n" +
                "\n" +
                "コール\n" +
                "先のプレイヤーと同数のチップを出して、ゲームを続けます。 \n" +
                "\n" +
                "レイズ\n" +
                "先のプレイヤーよりも多いチップを出して、せり挙げることです。\n" +
                "1人1回しかできません。 \n" +
                "\n" +
                "ドロップ\n" +
                "棄権することです。 \n" +
                "\n" +
                "ドロー\n" +
                "場に捨てたカードの枚数だけ、ストックからもらいます。 \n" +
                "\n" +
                "チェック\n" +
                "第2回目（ドローの後）におこなうパスの一種ですが、レイズはできません。 \n" +
                "\n" +
                "ポーカー\n" +
                "手札のなかでできる役。9種類あります。 \n" +
                "\n" +
                "\n" +
                "遊び方\n" +
                "1.各プレイヤーは参加チップとして1枚ずつ場に出します。\n" +
                "\n" +
                "2.親は、よく切ったカードを左側の人から順に1枚ずつ伏せて、手持ちが5枚ずつになるように\n" +
                "配ります。残りはストックとします。\n" +
                "\n" +
                "3.配られた手札を見て、親の左側の人から「ビッド」か「パス」かを順に宣言していきます。\n" +
                "誰か1人がビッドしたら、それ以後の人はパスできません。\n" +
                "\n" +
                "4.最初にビッドする人は、チップの枚数を言って場に出します。\n" +
                " (チップは最高何枚までと、決めておいた方がよいでしょう。)\n" +
                "\n" +
                "5.次の人からは、コールかレイズかドロップでゲームを進めます。レイズする人は、チップの枚数を\n" +
                "言わねばなりません。\n" +
                "\n" +
                "6.最高のビッドに対して、誰もレイズをしないままに1巡したら、第1回目のビッドは終りです。\n" +
                "\n" +
                "7.ゲームに残った人が3人以上いた場合は、親の左側に近い人から手札を交換、ドローをします。\n" +
                "\n" +
                "8.より強い役をつくるために、手札の中の不要なカードを場に伏せて出し、捨てた枚数だけ\n" +
                "親からもらいます。親は自分で交換しますが、何枚交換したかを告げます。\n" +
                "そして、それぞれ新しい手札を検討します。\n" +
                "\n" +
                "9.ストック・カードがなくなった時は、捨て札を集めてよく切り、使います。\n" +
                "\n" +
                "10.ドローが済むと、第2回目のビッドです。新しい手札を検討し、第1回目の最初にビッドした\n" +
                "人から「ビッド」か「チェック」の宣言をしていきます。\n" +
                "この時、誰か1人がビッドをしたら、それ以降の人はチェックできません。\n" +
                "\n" +
                "11.そして前回同様にコール・レイズ・ドロップをしてゲームを進めます。\n" +
                "\n" +
                "12.最高のビッドに対して誰もレイズしないまま1巡した時、このせりは終了です。手札を公開し、\n" +
                "他のプレイヤーと比べます。その中で最強のポーカー・ハンド(役)をもった人が勝ちとなり、\n" +
                "場にあるチップを全部獲得します。\n" +
                "\n" +
                "13.また、他のすべてのプレイヤーがドロップをした場合も同じです。\n" +
                "\n" +
                "14.こうして何回かゲームを続け、最終的には1番多くのチップを持っている人から順に、\n" +
                "1位、2位、3位……となります。\n";
        StringBuilder sb = new StringBuilder();
        String[] str = text.split("。");
        for(String s : str) {
            sb.append(s + "。\n");
        }
        txt.setText(sb.toString());
    }
}
