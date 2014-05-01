/* The following code was generated by JFlex 1.4.3 on 10/18/13 1:39 AM */

/* It's an automatically generated code. Do not modify it. */
package com.intellij.lexer;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.xml.XmlTokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 10/18/13 1:39 AM from the specification file
 * <tt>/Users/denofevil/Code/IDEA/tools/lexer/../../community/xml/xml-psi-impl/src/com/intellij/lexer/_HtmlLexer.flex</tt>
 */
public class _HtmlLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int PROCESSING_INSTRUCTION = 18;
  public static final int C_COMMENT_END = 28;
  public static final int END_TAG_NAME = 8;
  public static final int START_TAG_NAME = 6;
  public static final int ATTRIBUTE_VALUE_SQ = 16;
  public static final int DOC_TYPE = 2;
  public static final int ATTRIBUTE_VALUE_DQ = 14;
  public static final int YYINITIAL = 0;
  public static final int TAG_CHARACTERS = 24;
  public static final int START_TAG_NAME2 = 20;
  public static final int TAG_ATTRIBUTES = 10;
  public static final int COMMENT = 4;
  public static final int ATTRIBUTE_VALUE_START = 12;
  public static final int C_COMMENT_START = 26;
  public static final int END_TAG_NAME2 = 22;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7,  7, 
     8,  8,  9,  9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\2\3\1\0\2\3\22\0\1\3\1\13\1\10\1\7\1\40"+
    "\1\0\1\45\1\11\1\44\1\44\3\0\1\6\1\5\1\47\12\2"+
    "\1\4\1\54\1\12\1\53\1\43\1\46\1\0\1\63\1\35\1\17"+
    "\1\14\1\25\1\63\1\1\1\26\1\37\2\1\1\31\1\27\1\1"+
    "\1\15\1\23\3\1\1\20\1\33\3\1\1\22\1\1\1\50\1\52"+
    "\1\51\1\0\1\4\1\0\1\56\1\36\1\17\1\14\1\25\1\63"+
    "\1\55\1\26\1\37\2\1\1\32\1\30\1\61\1\16\1\24\1\60"+
    "\1\1\1\57\1\21\1\34\2\1\1\62\1\22\1\1\1\41\1\44"+
    "\1\42\54\0\1\1\12\0\1\1\4\0\1\1\5\0\27\1\1\0"+
    "\37\1\1\0\u013f\1\31\0\162\1\4\0\14\1\16\0\5\1\11\0"+
    "\1\1\213\0\1\1\13\0\1\1\1\0\3\1\1\0\1\1\1\0"+
    "\24\1\1\0\54\1\1\0\46\1\1\0\5\1\4\0\202\1\10\0"+
    "\105\1\1\0\46\1\2\0\2\1\6\0\20\1\41\0\46\1\2\0"+
    "\1\1\7\0\47\1\110\0\33\1\5\0\3\1\56\0\32\1\5\0"+
    "\13\1\43\0\2\1\1\0\143\1\1\0\1\1\17\0\2\1\7\0"+
    "\2\1\12\0\3\1\2\0\1\1\20\0\1\1\1\0\36\1\35\0"+
    "\3\1\60\0\46\1\13\0\1\1\u0152\0\66\1\3\0\1\1\22\0"+
    "\1\1\7\0\12\1\43\0\10\1\2\0\2\1\2\0\26\1\1\0"+
    "\7\1\1\0\1\1\3\0\4\1\3\0\1\1\36\0\2\1\1\0"+
    "\3\1\16\0\2\1\23\0\6\1\4\0\2\1\2\0\26\1\1\0"+
    "\7\1\1\0\2\1\1\0\2\1\1\0\2\1\37\0\4\1\1\0"+
    "\1\1\23\0\3\1\20\0\11\1\1\0\3\1\1\0\26\1\1\0"+
    "\7\1\1\0\2\1\1\0\5\1\3\0\1\1\22\0\1\1\17\0"+
    "\2\1\43\0\10\1\2\0\2\1\2\0\26\1\1\0\7\1\1\0"+
    "\2\1\1\0\5\1\3\0\1\1\36\0\2\1\1\0\3\1\17\0"+
    "\1\1\21\0\1\1\1\0\6\1\3\0\3\1\1\0\4\1\3\0"+
    "\2\1\1\0\1\1\1\0\2\1\3\0\2\1\3\0\3\1\3\0"+
    "\10\1\1\0\3\1\113\0\10\1\1\0\3\1\1\0\27\1\1\0"+
    "\12\1\1\0\5\1\46\0\2\1\43\0\10\1\1\0\3\1\1\0"+
    "\27\1\1\0\12\1\1\0\5\1\3\0\1\1\40\0\1\1\1\0"+
    "\2\1\43\0\10\1\1\0\3\1\1\0\27\1\1\0\20\1\46\0"+
    "\2\1\43\0\22\1\3\0\30\1\1\0\11\1\1\0\1\1\2\0"+
    "\7\1\72\0\60\1\1\0\2\1\14\0\7\1\72\0\2\1\1\0"+
    "\1\1\2\0\2\1\1\0\1\1\2\0\1\1\6\0\4\1\1\0"+
    "\7\1\1\0\3\1\1\0\1\1\1\0\1\1\2\0\2\1\1\0"+
    "\4\1\1\0\2\1\11\0\1\1\2\0\5\1\1\0\1\1\25\0"+
    "\2\1\42\0\1\1\77\0\10\1\1\0\42\1\35\0\4\1\164\0"+
    "\42\1\1\0\5\1\1\0\2\1\45\0\6\1\112\0\46\1\12\0"+
    "\51\1\7\0\132\1\5\0\104\1\5\0\122\1\6\0\7\1\1\0"+
    "\77\1\1\0\1\1\1\0\4\1\2\0\7\1\1\0\1\1\1\0"+
    "\4\1\2\0\47\1\1\0\1\1\1\0\4\1\2\0\37\1\1\0"+
    "\1\1\1\0\4\1\2\0\7\1\1\0\1\1\1\0\4\1\2\0"+
    "\7\1\1\0\7\1\1\0\27\1\1\0\37\1\1\0\1\1\1\0"+
    "\4\1\2\0\7\1\1\0\47\1\1\0\23\1\105\0\125\1\14\0"+
    "\u026c\1\2\0\10\1\12\0\32\1\5\0\113\1\25\0\15\1\1\0"+
    "\4\1\16\0\22\1\16\0\22\1\16\0\15\1\1\0\3\1\17\0"+
    "\64\1\43\0\1\1\4\0\1\1\103\0\130\1\10\0\51\1\127\0"+
    "\35\1\63\0\36\1\2\0\5\1\u038b\0\154\1\224\0\234\1\4\0"+
    "\132\1\6\0\26\1\2\0\6\1\2\0\46\1\2\0\6\1\2\0"+
    "\10\1\1\0\1\1\1\0\1\1\1\0\1\1\1\0\37\1\2\0"+
    "\65\1\1\0\7\1\1\0\1\1\3\0\3\1\1\0\7\1\3\0"+
    "\4\1\2\0\6\1\4\0\15\1\5\0\3\1\1\0\7\1\164\0"+
    "\1\1\15\0\1\1\202\0\1\1\4\0\1\1\2\0\12\1\1\0"+
    "\1\1\3\0\5\1\6\0\1\1\1\0\1\1\1\0\1\1\1\0"+
    "\4\1\1\0\3\1\1\0\7\1\3\0\3\1\5\0\5\1\u0ebb\0"+
    "\2\1\52\0\5\1\5\0\2\1\4\0\126\1\6\0\3\1\1\0"+
    "\132\1\1\0\4\1\5\0\50\1\4\0\136\1\21\0\30\1\70\0"+
    "\20\1\u0200\0\u19b6\1\112\0\u51a6\1\132\0\u048d\1\u0773\0\u2ba4\1\u215c\0"+
    "\u012e\1\2\0\73\1\225\0\7\1\14\0\5\1\5\0\1\1\1\0"+
    "\12\1\1\0\15\1\1\0\5\1\1\0\1\1\1\0\2\1\1\0"+
    "\2\1\1\0\154\1\41\0\u016b\1\22\0\100\1\2\0\66\1\50\0"+
    "\14\1\164\0\5\1\1\0\207\1\44\0\32\1\6\0\32\1\13\0"+
    "\131\1\3\0\6\1\2\0\6\1\2\0\6\1\2\0\3\1\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\1\10\0\1\2\5\0\1\1\1\3\5\1\1\4"+
    "\1\5\4\4\1\6\1\4\3\7\1\10\1\7\1\11"+
    "\1\12\1\13\1\14\2\12\1\15\1\16\1\12\1\17"+
    "\1\20\1\21\1\22\2\20\1\23\1\24\4\23\1\2"+
    "\1\25\1\4\1\26\3\27\1\30\1\7\3\30\1\31"+
    "\1\32\1\33\1\0\1\34\1\35\15\0\1\35\1\36"+
    "\2\20\3\0\1\37\2\0\1\40\1\41\1\42\1\43"+
    "\11\0\1\44\1\45\1\0\1\46\1\20\1\46\1\47"+
    "\1\0\1\50\3\0\1\15\3\0\1\51\2\0\1\52";

  private static int [] zzUnpackAction() {
    int [] result = new int[130];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\u0138\0\u016c"+
    "\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4\0\u02d8\0\u030c"+
    "\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u0410\0\u0444\0\u0374\0\u0478"+
    "\0\u04ac\0\u04e0\0\u0514\0\u0548\0\u0374\0\u0410\0\u0374\0\u057c"+
    "\0\u05b0\0\u0374\0\u0410\0\u0374\0\u0374\0\u05e4\0\u0374\0\u0410"+
    "\0\u0618\0\u064c\0\u0374\0\u0680\0\u0374\0\u06b4\0\u0374\0\u0374"+
    "\0\u06e8\0\u071c\0\u0374\0\u0374\0\u0750\0\u0410\0\u0784\0\u07b8"+
    "\0\u07ec\0\u0374\0\u0820\0\u0854\0\u0374\0\u0410\0\u0680\0\u0374"+
    "\0\u0888\0\u057c\0\u0410\0\u08bc\0\u0374\0\u08f0\0\u0924\0\u0958"+
    "\0\u0374\0\u098c\0\u09c0\0\u09f4\0\u0a28\0\u0a5c\0\u0a90\0\u0ac4"+
    "\0\u0af8\0\u04ac\0\u04e0\0\u0b2c\0\u0b60\0\u0b94\0\u0bc8\0\u0374"+
    "\0\u0374\0\u0bfc\0\u0c30\0\u0c64\0\u0c98\0\u0ccc\0\u0374\0\u0d00"+
    "\0\u0d34\0\u0d68\0\u0d9c\0\u0374\0\u0374\0\u0dd0\0\u0e04\0\u0e38"+
    "\0\u0e6c\0\u0ea0\0\u0ed4\0\u0f08\0\u0f3c\0\u0f70\0\u0374\0\u0374"+
    "\0\u0fa4\0\u06b4\0\u0fd8\0\u0374\0\u0374\0\u100c\0\u0374\0\u1040"+
    "\0\u1074\0\u10a8\0\u0374\0\u10dc\0\u1110\0\u1144\0\u0374\0\u1178"+
    "\0\u11ac\0\u0374";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[130];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\3\20\1\21\3\20\1\22\2\20\1\23\25\20\1\24"+
    "\4\20\1\25\4\20\1\26\11\20\3\27\1\30\4\27"+
    "\1\31\1\32\11\27\2\33\1\27\1\34\14\27\1\35"+
    "\1\27\1\36\16\27\6\37\1\40\3\37\1\41\30\37"+
    "\1\42\1\37\1\43\2\37\1\44\13\37\1\45\1\46"+
    "\1\45\1\30\1\46\5\45\1\47\1\45\24\46\5\45"+
    "\1\50\7\45\7\46\1\45\1\46\1\45\1\30\1\46"+
    "\5\45\1\51\1\45\24\46\5\45\1\50\7\45\7\46"+
    "\1\45\1\52\1\45\1\30\1\52\7\45\24\52\3\45"+
    "\1\53\1\45\1\50\1\45\1\54\3\45\1\55\1\45"+
    "\7\52\3\56\1\30\4\56\1\57\1\60\26\56\1\61"+
    "\2\56\1\53\3\56\1\62\14\56\10\63\1\64\27\63"+
    "\1\65\4\63\1\66\4\63\1\67\22\63\1\64\26\63"+
    "\1\70\4\63\1\66\4\63\1\67\11\63\43\71\1\72"+
    "\2\71\1\73\15\71\7\27\1\74\2\27\1\47\32\27"+
    "\1\36\16\27\3\45\1\30\3\45\1\52\2\45\1\51"+
    "\30\45\1\53\1\45\1\50\16\45\3\75\1\30\6\75"+
    "\1\47\30\75\1\53\1\75\1\76\1\75\1\77\14\75"+
    "\1\100\1\101\4\100\1\102\5\100\24\101\5\100\1\103"+
    "\3\100\1\104\3\100\7\101\1\100\1\101\4\100\1\102"+
    "\5\100\24\101\5\100\1\103\3\100\1\105\3\100\7\101"+
    "\3\20\1\0\3\20\1\0\2\20\1\0\25\20\1\0"+
    "\4\20\1\0\4\20\1\26\11\20\3\0\1\21\145\0"+
    "\1\106\2\0\1\106\2\0\1\107\3\0\1\110\24\106"+
    "\6\0\1\111\1\112\5\0\7\106\41\0\1\113\23\0"+
    "\1\114\2\0\1\114\2\0\1\115\4\0\16\114\1\116"+
    "\5\114\15\0\1\116\1\117\1\114\1\120\1\121\2\114"+
    "\3\20\1\0\6\20\1\0\32\20\1\0\4\20\1\26"+
    "\11\20\3\0\1\30\60\0\10\122\1\63\53\122\11\123"+
    "\1\63\52\123\33\0\2\124\47\0\2\125\50\0\1\126"+
    "\70\0\1\127\51\0\2\46\1\0\3\46\5\0\24\46"+
    "\15\0\7\46\47\0\1\130\15\0\2\52\1\0\3\52"+
    "\5\0\24\52\15\0\7\52\43\0\1\131\20\0\3\56"+
    "\1\0\37\56\1\0\3\56\1\132\17\56\1\0\35\56"+
    "\1\133\1\56\1\0\3\56\1\132\17\56\1\0\37\56"+
    "\1\131\3\56\1\132\14\56\41\0\1\134\62\0\1\63"+
    "\64\0\1\135\22\0\43\71\1\0\2\71\1\136\60\71"+
    "\1\72\20\71\1\0\2\74\1\0\3\74\5\0\24\74"+
    "\15\0\7\74\1\0\3\101\1\0\1\101\5\0\25\101"+
    "\4\0\2\101\7\0\7\101\43\0\1\137\21\0\2\106"+
    "\1\0\3\106\5\0\24\106\15\0\7\106\1\0\2\107"+
    "\1\0\3\107\5\0\24\107\15\0\7\107\6\0\1\140"+
    "\5\0\1\141\50\0\1\142\2\0\1\142\2\0\1\143"+
    "\4\0\24\142\15\0\7\142\42\113\1\144\21\113\1\0"+
    "\2\114\1\0\3\114\5\0\24\114\14\0\1\145\7\114"+
    "\2\0\1\146\57\0\1\147\2\0\2\114\1\0\3\114"+
    "\5\0\5\114\1\150\16\114\14\0\1\145\7\114\1\0"+
    "\2\114\1\0\3\114\5\0\10\114\1\151\3\114\1\152"+
    "\7\114\14\0\1\145\7\114\1\0\2\114\1\0\3\114"+
    "\5\0\20\114\1\153\3\114\14\0\1\145\7\114\1\0"+
    "\2\114\1\0\3\114\5\0\22\114\1\154\1\114\14\0"+
    "\1\145\7\114\35\0\2\155\54\0\2\156\36\0\1\126"+
    "\37\0\1\157\70\0\1\160\13\0\43\56\1\0\3\56"+
    "\1\132\14\56\3\133\1\161\36\133\1\162\1\161\3\133"+
    "\1\163\14\133\10\134\1\0\31\134\1\164\21\134\11\135"+
    "\1\0\30\135\1\164\21\135\43\71\1\0\20\71\6\0"+
    "\1\165\72\0\2\166\46\0\2\142\1\0\3\142\5\0"+
    "\24\142\15\0\7\142\1\0\2\143\1\0\3\143\5\0"+
    "\24\143\15\0\7\143\2\0\1\146\51\0\1\167\11\0"+
    "\1\170\11\0\1\170\2\0\1\170\5\0\1\170\7\0"+
    "\2\170\17\0\1\170\4\0\1\170\1\0\2\114\1\0"+
    "\3\114\5\0\24\114\14\0\1\167\7\114\1\0\2\114"+
    "\1\0\3\114\5\0\2\114\1\171\21\114\14\0\1\145"+
    "\7\114\1\0\2\114\1\0\3\114\5\0\10\114\1\150"+
    "\13\114\14\0\1\145\7\114\1\0\2\114\1\0\3\114"+
    "\5\0\2\114\1\116\21\114\14\0\1\145\7\114\1\0"+
    "\2\114\1\0\3\114\5\0\24\114\14\0\1\145\2\114"+
    "\1\152\4\114\31\0\2\172\62\0\2\173\31\0\42\161"+
    "\1\164\21\161\42\133\1\162\1\161\3\133\1\163\14\133"+
    "\17\0\1\174\46\0\1\170\11\0\1\170\2\0\1\170"+
    "\5\0\1\170\7\0\2\170\15\0\1\167\1\0\1\170"+
    "\4\0\1\170\1\0\2\114\1\0\3\114\5\0\24\114"+
    "\14\0\1\145\2\114\1\150\4\114\37\0\1\175\44\0"+
    "\2\176\61\0\1\177\66\0\1\200\64\0\2\201\64\0"+
    "\1\202\36\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[4576];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\1\10\0\1\1\5\0\2\1\1\11\4\1\1\11"+
    "\5\1\1\11\1\1\1\11\2\1\1\11\1\1\2\11"+
    "\1\1\1\11\3\1\1\11\1\1\1\11\1\1\2\11"+
    "\2\1\2\11\5\1\1\11\2\1\1\11\2\1\1\11"+
    "\4\1\1\11\2\1\1\0\1\11\1\1\15\0\2\11"+
    "\2\1\3\0\1\11\2\0\2\1\2\11\11\0\2\11"+
    "\1\0\2\1\2\11\1\0\1\11\3\0\1\11\3\0"+
    "\1\11\2\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[130];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  private IElementType elTokenType = XmlTokenType.XML_DATA_CHARACTERS;
  private IElementType elTokenType2 = XmlTokenType.XML_ATTRIBUTE_VALUE_TOKEN;

  public void setElTypes(IElementType _elTokenType,IElementType _elTokenType2) {
    elTokenType = _elTokenType;
    elTokenType2 = _elTokenType2;
  }

  public _HtmlLexer() {
    this((java.io.Reader)null);
  }


  public _HtmlLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public _HtmlLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1260) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 19: 
          { return XmlTokenType.XML_ATTRIBUTE_VALUE_TOKEN;
          }
        case 43: break;
        case 26: 
          { yybegin(START_TAG_NAME); yypushback(yylength());
          }
        case 44: break;
        case 23: 
          { return XmlTokenType.XML_TAG_CHARACTERS;
          }
        case 45: break;
        case 15: 
          { yybegin(ATTRIBUTE_VALUE_START); return XmlTokenType.XML_EQ;
          }
        case 46: break;
        case 34: 
          { return elTokenType;
          }
        case 47: break;
        case 13: 
          { return XmlTokenType.XML_NAME;
          }
        case 48: break;
        case 20: 
          { yybegin(TAG_ATTRIBUTES); return XmlTokenType.XML_ATTRIBUTE_VALUE_END_DELIMITER;
          }
        case 49: break;
        case 10: 
          { yybegin(YYINITIAL); yypushback(1); break;
          }
        case 50: break;
        case 41: 
          { return XmlTokenType.XML_DOCTYPE_PUBLIC;
          }
        case 51: break;
        case 8: 
          { int loc = getTokenStart();
  char prev = zzBuffer.charAt(loc - 1);
  char prevPrev = zzBuffer.charAt(loc - 2);
  if (prev == '-' && prevPrev == '-') {
    yybegin(YYINITIAL); return XmlTokenType.XML_COMMENT_END;
  }
  return XmlTokenType.XML_COMMENT_CHARACTERS;
          }
        case 52: break;
        case 39: 
          { yybegin(COMMENT); return XmlTokenType.XML_COMMENT_START;
          }
        case 53: break;
        case 3: 
          { return XmlTokenType.XML_REAL_WHITE_SPACE;
          }
        case 54: break;
        case 32: 
          { yybegin(END_TAG_NAME); yypushback(yylength());
          }
        case 55: break;
        case 1: 
          { return XmlTokenType.XML_DATA_CHARACTERS;
          }
        case 56: break;
        case 25: 
          { yybegin(COMMENT); return XmlTokenType.XML_CONDITIONAL_COMMENT_END;
          }
        case 57: break;
        case 33: 
          { yybegin(END_TAG_NAME2); yypushback(yylength());
          }
        case 58: break;
        case 4: 
          { return XmlTokenType.XML_BAD_CHARACTER;
          }
        case 59: break;
        case 14: 
          { yybegin(YYINITIAL); return XmlTokenType.XML_TAG_END;
          }
        case 60: break;
        case 31: 
          { yybegin(COMMENT); return XmlTokenType.XML_CONDITIONAL_COMMENT_START_END;
          }
        case 61: break;
        case 29: 
          { return XmlTokenType.XML_END_TAG_START;
          }
        case 62: break;
        case 36: 
          { yybegin(YYINITIAL); return XmlTokenType.XML_COMMENT_END;
          }
        case 63: break;
        case 42: 
          { yybegin(DOC_TYPE); return XmlTokenType.XML_DOCTYPE_START;
          }
        case 64: break;
        case 2: 
          { return XmlTokenType.XML_PI_TARGET;
          }
        case 65: break;
        case 30: 
          { yybegin(YYINITIAL); return XmlTokenType.XML_EMPTY_ELEMENT_END;
          }
        case 66: break;
        case 37: 
          { yybegin(C_COMMENT_END); return XmlTokenType.XML_CONDITIONAL_COMMENT_END_START;
          }
        case 67: break;
        case 28: 
          { yybegin(PROCESSING_INSTRUCTION); return XmlTokenType.XML_PI_START;
          }
        case 68: break;
        case 9: 
          { yybegin(C_COMMENT_START); return XmlTokenType.XML_CONDITIONAL_COMMENT_START;
          }
        case 69: break;
        case 22: 
          { yybegin(TAG_CHARACTERS); return XmlTokenType.XML_NAME;
          }
        case 70: break;
        case 6: 
          { yybegin(YYINITIAL); return XmlTokenType.XML_DOCTYPE_END;
          }
        case 71: break;
        case 40: 
          { return XmlTokenType.XML_CHAR_ENTITY_REF;
          }
        case 72: break;
        case 12: 
          { return XmlTokenType.XML_START_TAG_START;
          }
        case 73: break;
        case 5: 
          { return XmlTokenType.XML_WHITE_SPACE;
          }
        case 74: break;
        case 35: 
          { return XmlTokenType.XML_ENTITY_REF_TOKEN;
          }
        case 75: break;
        case 24: 
          { yybegin(COMMENT); return XmlTokenType.XML_COMMENT_CHARACTERS;
          }
        case 76: break;
        case 38: 
          { return elTokenType2;
          }
        case 77: break;
        case 21: 
          { yybegin(YYINITIAL); return XmlTokenType.XML_PI_END;
          }
        case 78: break;
        case 17: 
          { yybegin(ATTRIBUTE_VALUE_DQ); return XmlTokenType.XML_ATTRIBUTE_VALUE_START_DELIMITER;
          }
        case 79: break;
        case 18: 
          { yybegin(ATTRIBUTE_VALUE_SQ); return XmlTokenType.XML_ATTRIBUTE_VALUE_START_DELIMITER;
          }
        case 80: break;
        case 11: 
          { yybegin(TAG_ATTRIBUTES); return XmlTokenType.XML_NAME;
          }
        case 81: break;
        case 27: 
          { yybegin(START_TAG_NAME2); yypushback(yylength());
          }
        case 82: break;
        case 16: 
          { yybegin(TAG_ATTRIBUTES); return XmlTokenType.XML_ATTRIBUTE_VALUE_TOKEN;
          }
        case 83: break;
        case 7: 
          { return XmlTokenType.XML_COMMENT_CHARACTERS;
          }
        case 84: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}