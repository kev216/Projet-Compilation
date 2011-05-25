/* Generated By:JJTree&JavaCC: Do not edit this line. ParserTokenManager.java */

/** Token Manager. */
public class ParserTokenManager implements ParserConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x20000000000L) != 0L)
            return 4;
         if ((active0 & 0x400000L) != 0L)
            return 26;
         if ((active0 & 0x240000L) != 0L)
            return 28;
         if ((active0 & 0x40000000000L) != 0L)
            return 6;
         if ((active0 & 0x3f83fe40L) != 0L)
         {
            jjmatchedKind = 32;
            return 24;
         }
         return -1;
      case 1:
         if ((active0 & 0x18022200L) != 0L)
            return 24;
         if ((active0 & 0x2781dc40L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 1;
            return 24;
         }
         return -1;
      case 2:
         if ((active0 & 0x20011040L) != 0L)
            return 24;
         if ((active0 & 0x780cc00L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 2;
            return 24;
         }
         return -1;
      case 3:
         if ((active0 & 0x7004c00L) != 0L)
            return 24;
         if ((active0 & 0x808000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 3;
            return 24;
         }
         return -1;
      case 4:
         if ((active0 & 0x8000L) != 0L)
            return 24;
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 4;
            return 24;
         }
         return -1;
      case 5:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 5;
            return 24;
         }
         return -1;
      case 6:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 6;
            return 24;
         }
         return -1;
      case 7:
         if ((active0 & 0x800000L) != 0L)
         {
            jjmatchedKind = 32;
            jjmatchedPos = 7;
            return 24;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         return jjStopAtPos(0, 35);
      case 35:
         return jjStopAtPos(0, 37);
      case 40:
         return jjStopAtPos(0, 38);
      case 41:
         return jjStopAtPos(0, 39);
      case 42:
         return jjStopAtPos(0, 44);
      case 43:
         return jjStopAtPos(0, 43);
      case 44:
         return jjStopAtPos(0, 46);
      case 45:
         jjmatchedKind = 36;
         return jjMoveStringLiteralDfa1_0(0x80L);
      case 46:
         return jjStopAtPos(0, 34);
      case 59:
         return jjStopAtPos(0, 45);
      case 60:
         return jjStartNfaWithStates_0(0, 41, 4);
      case 61:
         jjmatchedKind = 21;
         return jjMoveStringLiteralDfa1_0(0x40000L);
      case 62:
         return jjStartNfaWithStates_0(0, 42, 6);
      case 79:
         return jjStartNfaWithStates_0(0, 22, 26);
      case 97:
         return jjMoveStringLiteralDfa1_0(0x10010000L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x800L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x2008040L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x2200L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x1000L);
      case 110:
         return jjMoveStringLiteralDfa1_0(0x20000000L);
      case 111:
         return jjMoveStringLiteralDfa1_0(0x20000L);
      case 112:
         return jjMoveStringLiteralDfa1_0(0x800000L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x1000000L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x4000000L);
      case 116:
         return jjMoveStringLiteralDfa1_0(0x8004400L);
      case 124:
         return jjMoveStringLiteralDfa1_0(0x100L);
      case 126:
         return jjStopAtPos(0, 40);
      default :
         return jjMoveNfa_0(3, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0);
      return 1;
   }
   switch(curChar)
   {
      case 45:
         return jjMoveStringLiteralDfa2_0(active0, 0x100L);
      case 61:
         if ((active0 & 0x40000L) != 0L)
            return jjStopAtPos(1, 18);
         break;
      case 62:
         if ((active0 & 0x80L) != 0L)
            return jjStopAtPos(1, 7);
         break;
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x25001000L);
      case 102:
         if ((active0 & 0x200L) != 0L)
            return jjStartNfaWithStates_0(1, 9, 24);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x400L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x800L);
      case 110:
         if ((active0 & 0x2000L) != 0L)
            return jjStartNfaWithStates_0(1, 13, 24);
         return jjMoveStringLiteralDfa2_0(active0, 0x10000L);
      case 111:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(1, 27, 24);
         break;
      case 114:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(1, 17, 24);
         return jjMoveStringLiteralDfa2_0(active0, 0x2804000L);
      case 116:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(1, 28, 24);
         break;
      case 117:
         return jjMoveStringLiteralDfa2_0(active0, 0x40L);
      default :
         break;
   }
   return jjStartNfa_0(0, active0);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(0, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0);
      return 2;
   }
   switch(curChar)
   {
      case 62:
         if ((active0 & 0x100L) != 0L)
            return jjStopAtPos(2, 8);
         break;
      case 99:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000L);
      case 100:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(2, 16, 24);
         break;
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x400L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      case 108:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000L);
      case 110:
         if ((active0 & 0x40L) != 0L)
            return jjStartNfaWithStates_0(2, 6, 24);
         return jjMoveStringLiteralDfa3_0(active0, 0x4000000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x2000000L);
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x800L);
      case 116:
         if ((active0 & 0x1000L) != 0L)
            return jjStartNfaWithStates_0(2, 12, 24);
         break;
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x4000L);
      case 119:
         if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(2, 29, 24);
         break;
      default :
         break;
   }
   return jjStartNfa_0(1, active0);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0);
      return 3;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(3, 26, 24);
         break;
      case 101:
         if ((active0 & 0x800L) != 0L)
            return jjStartNfaWithStates_0(3, 11, 24);
         else if ((active0 & 0x4000L) != 0L)
            return jjStartNfaWithStates_0(3, 14, 24);
         break;
      case 109:
         if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(3, 25, 24);
         break;
      case 110:
         if ((active0 & 0x400L) != 0L)
            return jjStartNfaWithStates_0(3, 10, 24);
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x8000L);
      case 118:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(3, 24, 24);
         break;
      default :
         break;
   }
   return jjStartNfa_0(2, active0);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0);
      return 4;
   }
   switch(curChar)
   {
      case 101:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(4, 15, 24);
         break;
      case 116:
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0);
      return 5;
   }
   switch(curChar)
   {
      case 95:
         return jjMoveStringLiteralDfa6_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0);
      return 6;
   }
   switch(curChar)
   {
      case 105:
         return jjMoveStringLiteralDfa7_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0);
      return 7;
   }
   switch(curChar)
   {
      case 110:
         return jjMoveStringLiteralDfa8_0(active0, 0x800000L);
      default :
         break;
   }
   return jjStartNfa_0(6, active0);
}
static private int jjMoveStringLiteralDfa8_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(6, old0);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(7, active0);
      return 8;
   }
   switch(curChar)
   {
      case 116:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(8, 23, 24);
         break;
      default :
         break;
   }
   return jjStartNfa_0(7, active0);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 30;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((0x3ff000000000000L & l) != 0L)
                  {
                     if (kind > 31)
                        kind = 31;
                     jjCheckNAdd(22);
                  }
                  else if (curChar == 61)
                     jjAddStates(0, 1);
                  else if (curChar == 62)
                     jjstateSet[jjnewStateCnt++] = 6;
                  else if (curChar == 60)
                     jjstateSet[jjnewStateCnt++] = 4;
                  else if (curChar == 47)
                     jjstateSet[jjnewStateCnt++] = 0;
                  break;
               case 28:
                  if (curChar == 62)
                  {
                     if (kind > 20)
                        kind = 20;
                  }
                  else if (curChar == 60)
                  {
                     if (kind > 19)
                        kind = 19;
                  }
                  break;
               case 0:
                  if (curChar == 47)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 1:
                  if ((0xfffffffffffffbffL & l) != 0L)
                     jjCheckNAddTwoStates(1, 2);
                  break;
               case 2:
                  if (curChar == 10)
                     kind = 5;
                  break;
               case 4:
                  if (curChar == 61 && kind > 19)
                     kind = 19;
                  break;
               case 5:
                  if (curChar == 60)
                     jjstateSet[jjnewStateCnt++] = 4;
                  break;
               case 6:
                  if (curChar == 61 && kind > 20)
                     kind = 20;
                  break;
               case 7:
                  if (curChar == 62)
                     jjstateSet[jjnewStateCnt++] = 6;
                  break;
               case 22:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 31)
                     kind = 31;
                  jjCheckNAdd(22);
                  break;
               case 24:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjstateSet[jjnewStateCnt++] = 24;
                  break;
               case 26:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjstateSet[jjnewStateCnt++] = 26;
                  break;
               case 27:
                  if (curChar == 61)
                     jjAddStates(0, 1);
                  break;
               case 29:
                  if (curChar == 62 && kind > 20)
                     kind = 20;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 3:
                  if ((0x7fffffeL & l) != 0L)
                  {
                     if (kind > 33)
                        kind = 33;
                     jjCheckNAdd(26);
                  }
                  else if ((0x7fffffe00000000L & l) != 0L)
                  {
                     if (kind > 32)
                        kind = 32;
                     jjCheckNAdd(24);
                  }
                  if (curChar == 80)
                     jjstateSet[jjnewStateCnt++] = 20;
                  else if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 16;
                  else if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 13;
                  else if (curChar == 66)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 1:
                  jjAddStates(2, 3);
                  break;
               case 8:
                  if (curChar == 108 && kind > 30)
                     kind = 30;
                  break;
               case 9:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 8;
                  break;
               case 10:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 9;
                  break;
               case 11:
                  if (curChar == 66)
                     jjstateSet[jjnewStateCnt++] = 10;
                  break;
               case 12:
                  if (curChar == 116 && kind > 30)
                     kind = 30;
                  break;
               case 13:
                  if (curChar == 110)
                     jjstateSet[jjnewStateCnt++] = 12;
                  break;
               case 14:
                  if (curChar == 73)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 15:
                  if (curChar == 102 && kind > 30)
                     kind = 30;
                  break;
               case 16:
                  if (curChar == 101)
                     jjstateSet[jjnewStateCnt++] = 15;
                  break;
               case 17:
                  if (curChar == 82)
                     jjstateSet[jjnewStateCnt++] = 16;
                  break;
               case 18:
                  if (curChar == 99 && kind > 30)
                     kind = 30;
                  break;
               case 19:
                  if (curChar == 111)
                     jjstateSet[jjnewStateCnt++] = 18;
                  break;
               case 20:
                  if (curChar == 114)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 21:
                  if (curChar == 80)
                     jjstateSet[jjnewStateCnt++] = 20;
                  break;
               case 23:
                  if ((0x7fffffe00000000L & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAdd(24);
                  break;
               case 24:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 32)
                     kind = 32;
                  jjCheckNAdd(24);
                  break;
               case 25:
                  if ((0x7fffffeL & l) == 0L)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjCheckNAdd(26);
                  break;
               case 26:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 33)
                     kind = 33;
                  jjCheckNAdd(26);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 1:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(2, 3);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 30 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   28, 29, 1, 2, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, "\146\165\156", "\55\76", "\174\55\76", 
"\151\146", "\164\150\145\156", "\145\154\163\145", "\154\145\164", "\151\156", 
"\164\162\165\145", "\146\141\154\163\145", "\141\156\144", "\157\162", "\75\75", null, null, 
"\75", "\117", "\160\162\151\156\164\137\151\156\164", "\162\145\143\166", 
"\146\162\157\155", "\163\145\156\144", "\164\157", "\141\164", "\156\145\167", null, null, null, 
null, "\56", "\41", "\55", "\43", "\50", "\51", "\176", "\74", "\76", "\53", "\52", 
"\73", "\54", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0x7fffffffffc1L, 
};
static final long[] jjtoSkip = {
   0x3eL, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[30];
static private final int[] jjstateSet = new int[60];
static protected char curChar;
/** Constructor. */
public ParserTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public ParserTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 30; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

}