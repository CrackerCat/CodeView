package com.amrdeveloper.codeviewlibrary.syntax;

import android.content.Context;
import android.content.res.Resources;

import com.amrdeveloper.codeview.Code;
import com.amrdeveloper.codeview.CodeView;
import com.amrdeveloper.codeview.Keyword;
import com.amrdeveloper.codeviewlibrary.R;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

public class GoLanguage {

    //Language Keywords
    private static final Pattern PATTERN_KEYWORDS = Pattern.compile("\\b(break|default|func|interface|case|defer|" +
            "go|map|struct|chan|else|goto|package|switch|const" +
            "|fallthrough|if|range|type|continue|for|import|return|var|" +
            "string|true|false|new|nil|byte|bool|int|int8|int16|int32|int64)\\b");

    //Brackets and Colons
    private static final Pattern PATTERN_BUILTINS = Pattern.compile("[,:;[->]{}()]");

    //Data
    private static final Pattern PATTERN_NUMBERS = Pattern.compile("\\b(\\d*[.]?\\d+)\\b");
    private static final Pattern PATTERN_CHAR = Pattern.compile("'[a-zA-Z]'");
    private static final Pattern PATTERN_STRING = Pattern.compile("\".*\"");
    private static final Pattern PATTERN_HEX = Pattern.compile("0x[0-9a-fA-F]+");
    private static final Pattern PATTERN_SINGLE_LINE_COMMENT = Pattern.compile("//[^\\n]*");
    private static final Pattern PATTERN_MULTI_LINE_COMMENT = Pattern.compile("/\\*[^*]*\\*+(?:[^/*][^*]*\\*+)*/");
    private static final Pattern PATTERN_ATTRIBUTE = Pattern.compile("\\.[a-zA-Z0-9_]+");
    private static final Pattern PATTERN_OPERATION =Pattern.compile( ":|==|>|<|!=|>=|<=|->|=|>|<|%|-|-=|%=|\\+|\\-|\\-=|\\+=|\\^|\\&|\\|::|\\?|\\*");

    public static void applyMonokaiTheme(Context context, CodeView codeView) {
        codeView.resetSyntaxPatternList();
        codeView.resetHighlighter();

        Resources resources = context.getResources();

        //View Background
        codeView.setBackgroundColor(resources.getColor(R.color.monokia_pro_black));

        //Syntax Colors
        codeView.addSyntaxPattern(PATTERN_HEX, resources.getColor(R.color.monokia_pro_purple));
        codeView.addSyntaxPattern(PATTERN_CHAR, resources.getColor(R.color.monokia_pro_green));
        codeView.addSyntaxPattern(PATTERN_STRING, resources.getColor(R.color.monokia_pro_orange));
        codeView.addSyntaxPattern(PATTERN_NUMBERS, resources.getColor(R.color.monokia_pro_purple));
        codeView.addSyntaxPattern(PATTERN_KEYWORDS, resources.getColor(R.color.monokia_pro_pink));
        codeView.addSyntaxPattern(PATTERN_BUILTINS, resources.getColor(R.color.monokia_pro_white));
        codeView.addSyntaxPattern(PATTERN_SINGLE_LINE_COMMENT, resources.getColor(R.color.monokia_pro_grey));
        codeView.addSyntaxPattern(PATTERN_MULTI_LINE_COMMENT, resources.getColor(R.color.monokia_pro_grey));
        codeView.addSyntaxPattern(PATTERN_ATTRIBUTE, resources.getColor(R.color.monokia_pro_sky));
        codeView.addSyntaxPattern(PATTERN_OPERATION, resources.getColor(R.color.monokia_pro_pink));

        //Default Color
        codeView.setTextColor(resources.getColor(R.color.monokia_pro_white));

        codeView.reHighlightSyntax();
    }

    public static void applyNoctisWhiteTheme(Context context, CodeView codeView) {
        codeView.resetSyntaxPatternList();
        codeView.resetHighlighter();

        Resources resources = context.getResources();

        //View Background
        codeView.setBackgroundColor(resources.getColor(R.color.noctis_white));

        //Syntax Colors
        codeView.addSyntaxPattern(PATTERN_HEX, resources.getColor(R.color.noctis_purple));
        codeView.addSyntaxPattern(PATTERN_CHAR, resources.getColor(R.color.noctis_green));
        codeView.addSyntaxPattern(PATTERN_STRING, resources.getColor(R.color.noctis_green));
        codeView.addSyntaxPattern(PATTERN_NUMBERS, resources.getColor(R.color.noctis_purple));
        codeView.addSyntaxPattern(PATTERN_KEYWORDS, resources.getColor(R.color.noctis_pink));
        codeView.addSyntaxPattern(PATTERN_BUILTINS, resources.getColor(R.color.noctis_dark_blue));
        codeView.addSyntaxPattern(PATTERN_SINGLE_LINE_COMMENT, resources.getColor(R.color.noctis_grey));
        codeView.addSyntaxPattern(PATTERN_MULTI_LINE_COMMENT, resources.getColor(R.color.noctis_grey));
        codeView.addSyntaxPattern(PATTERN_ATTRIBUTE, resources.getColor(R.color.noctis_blue));
        codeView.addSyntaxPattern(PATTERN_OPERATION, resources.getColor(R.color.monokia_pro_pink));

        //Default Color
        codeView.setTextColor(resources.getColor(R.color.noctis_orange));

        codeView.reHighlightSyntax();
    }

    public static void applyFiveColorsDarkTheme(Context context, CodeView codeView) {
        codeView.resetSyntaxPatternList();
        codeView.resetHighlighter();

        Resources resources = context.getResources();

        //View Background
        codeView.setBackgroundColor(resources.getColor(R.color.five_dark_black));

        //Syntax Colors
        codeView.addSyntaxPattern(PATTERN_HEX, resources.getColor(R.color.five_dark_purple));
        codeView.addSyntaxPattern(PATTERN_CHAR, resources.getColor(R.color.five_dark_yellow));
        codeView.addSyntaxPattern(PATTERN_STRING, resources.getColor(R.color.five_dark_yellow));
        codeView.addSyntaxPattern(PATTERN_NUMBERS, resources.getColor(R.color.five_dark_purple));
        codeView.addSyntaxPattern(PATTERN_KEYWORDS, resources.getColor(R.color.five_dark_purple));
        codeView.addSyntaxPattern(PATTERN_BUILTINS, resources.getColor(R.color.five_dark_white));
        codeView.addSyntaxPattern(PATTERN_SINGLE_LINE_COMMENT, resources.getColor(R.color.five_dark_grey));
        codeView.addSyntaxPattern(PATTERN_MULTI_LINE_COMMENT, resources.getColor(R.color.five_dark_grey));
        codeView.addSyntaxPattern(PATTERN_ATTRIBUTE, resources.getColor(R.color.five_dark_blue));
        codeView.addSyntaxPattern(PATTERN_OPERATION, resources.getColor(R.color.five_dark_purple));

        //Default Color
        codeView.setTextColor(resources.getColor(R.color.five_dark_white));

        codeView.reHighlightSyntax();
    }

    public static void applyOrangeBoxTheme(Context context, CodeView codeView) {
        codeView.resetSyntaxPatternList();
        codeView.resetHighlighter();

        Resources resources = context.getResources();

        //View Background
        codeView.setBackgroundColor(resources.getColor(R.color.orange_box_black));

        //Syntax Colors
        codeView.addSyntaxPattern(PATTERN_HEX, resources.getColor(R.color.gold));
        codeView.addSyntaxPattern(PATTERN_CHAR, resources.getColor(R.color.orange_box_orange2));
        codeView.addSyntaxPattern(PATTERN_STRING, resources.getColor(R.color.orange_box_orange2));
        codeView.addSyntaxPattern(PATTERN_NUMBERS, resources.getColor(R.color.five_dark_purple));
        codeView.addSyntaxPattern(PATTERN_KEYWORDS, resources.getColor(R.color.orange_box_orange1));
        codeView.addSyntaxPattern(PATTERN_BUILTINS, resources.getColor(R.color.orange_box_grey));
        codeView.addSyntaxPattern(PATTERN_SINGLE_LINE_COMMENT, resources.getColor(R.color.orange_box_dark_grey));
        codeView.addSyntaxPattern(PATTERN_MULTI_LINE_COMMENT, resources.getColor(R.color.orange_box_dark_grey));
        codeView.addSyntaxPattern(PATTERN_ATTRIBUTE, resources.getColor(R.color.orange_box_orange3));
        codeView.addSyntaxPattern(PATTERN_OPERATION, resources.getColor(R.color.gold));

        //Default Color
        codeView.setTextColor(resources.getColor(R.color.five_dark_white));

        codeView.reHighlightSyntax();
    }

    public static String[] getKeywords(Context context) {
        return context.getResources().getStringArray(R.array.go_keywords);
    }

    public static List<Code> getCodeList(Context context) {
        List<Code> codeList = new ArrayList<>();
        String[] keywords = getKeywords(context);
        for (String keyword : keywords) {
            codeList.add(new Keyword(keyword));
        }
        return codeList;
    }

    public static Set<Character> getIndentationStarts() {
        Set<Character> characterSet = new HashSet<>();
        characterSet.add('{');
        return characterSet;
    }

    public static Set<Character> getIndentationEnds() {
        Set<Character> characterSet = new HashSet<>();
        characterSet.add('}');
        return characterSet;
    }

    public static String getCommentStart() {
        return "//";
    }

    public static String getCommentEnd() {
        return "";
    }
}
