// $ANTLR 3.4 org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g 2013-05-30 14:16:11

	package org.wso2.siddhi.query.compiler;

    import org.wso2.siddhi.query.api.ExecutionPlan;
    import org.wso2.siddhi.query.api.QueryFactory;
    import org.wso2.siddhi.query.api.condition.Condition;
    import org.wso2.siddhi.query.api.condition.ConditionExtension;
    import org.wso2.siddhi.query.api.definition.Attribute;
    import org.wso2.siddhi.query.api.definition.StreamDefinition;
    import org.wso2.siddhi.query.api.expression.Expression;
    import org.wso2.siddhi.query.api.expression.ExpressionExtension;
    import org.wso2.siddhi.query.api.expression.Time;
    import org.wso2.siddhi.query.api.expression.Variable;
    import org.wso2.siddhi.query.api.expression.constant.Constant;
    import org.wso2.siddhi.query.api.extension.Extension;
    import org.wso2.siddhi.query.api.query.Query;
    import org.wso2.siddhi.query.api.query.input.BasicStream;
    import org.wso2.siddhi.query.api.query.input.JoinStream;
    import org.wso2.siddhi.query.api.query.input.SingleStream;
    import org.wso2.siddhi.query.api.query.input.Stream;
    import org.wso2.siddhi.query.api.query.input.handler.Filter;
    import org.wso2.siddhi.query.api.query.input.handler.TransformExtension;
    import org.wso2.siddhi.query.api.query.input.handler.Transformer;
    import org.wso2.siddhi.query.api.query.input.handler.Window;
    import org.wso2.siddhi.query.api.query.input.handler.WindowExtension;
    import org.wso2.siddhi.query.api.query.input.pattern.Pattern;
    import org.wso2.siddhi.query.api.query.input.pattern.PatternStream;
    import org.wso2.siddhi.query.api.query.input.pattern.element.LogicalElement;
    import org.wso2.siddhi.query.api.query.input.pattern.element.PatternElement;
    import org.wso2.siddhi.query.api.query.input.sequence.Sequence;
    import org.wso2.siddhi.query.api.query.input.sequence.SequenceStream;
    import org.wso2.siddhi.query.api.query.input.sequence.element.SequenceElement;
    import org.wso2.siddhi.query.api.query.output.OutStream;
    import org.wso2.siddhi.query.api.query.projection.Projector;
    import org.wso2.siddhi.query.api.query.projection.attribute.ComplexAttribute;
    import org.wso2.siddhi.query.api.query.projection.attribute.OutputAttribute;
    import org.wso2.siddhi.query.api.query.projection.attribute.OutputAttributeExtension;
    import org.wso2.siddhi.query.api.query.projection.attribute.SimpleAttribute;



import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SiddhiQLGrammarWalker extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ANONYMOUS", "ATTRIBUTE", "BOOL_VAL", "COLLECT", "COMMENT", "CONDITION", "CONDITION_FUNCTION", "CONSTANT", "DEFINITION", "EXTENSION", "EXTENSION_FUNCTION", "FILTER", "FOLLOWED_BY", "FUNCTION", "HANDLERS", "ID", "ID_QUOTES", "IN_ATTRIBUTE", "IP", "JOIN", "LINE_COMMENT", "NUM", "NUM_SCI", "OUT_ATTRIBUTE", "OUT_ATTRIBUTES", "OUT_STREAM", "PARAMETERS", "PATTERN", "PATTERN_FULL", "POSITIVE_DOUBLE_VAL", "POSITIVE_FLOAT_VAL", "POSITIVE_INT_VAL", "POSITIVE_LONG_VAL", "QUERY", "REGEX", "RETURN_QUERY", "SEQUENCE", "SEQUENCE_FULL", "SIGNED_VAL", "STREAM", "STRING_VAL", "TIME_EXP", "TRANSFORM", "WINDOW", "WS", "'!='", "'#'", "'%'", "'('", "')'", "'*'", "'+'", "','", "'-'", "'.'", "'/'", "':'", "';'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'?'", "'@'", "'['", "']'", "'all-events'", "'and'", "'as'", "'bool'", "'by'", "'call'", "'contains'", "'current-events'", "'day'", "'days'", "'define'", "'double'", "'every'", "'expired-events'", "'float'", "'from'", "'full'", "'group'", "'having'", "'hour'", "'hours'", "'inner'", "'insert'", "'instanceof'", "'int'", "'into'", "'join'", "'left'", "'long'", "'millisecond'", "'milliseconds'", "'min'", "'minute'", "'minutes'", "'month'", "'months'", "'not'", "'on'", "'or'", "'outer'", "'return'", "'right'", "'sec'", "'second'", "'seconds'", "'stream'", "'string'", "'transform'", "'unidirectional'", "'week'", "'weeks'", "'window'", "'within'", "'year'", "'years'"
    };

    public static final int EOF=-1;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__90=90;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__99=99;
    public static final int T__100=100;
    public static final int T__101=101;
    public static final int T__102=102;
    public static final int T__103=103;
    public static final int T__104=104;
    public static final int T__105=105;
    public static final int T__106=106;
    public static final int T__107=107;
    public static final int T__108=108;
    public static final int T__109=109;
    public static final int T__110=110;
    public static final int T__111=111;
    public static final int T__112=112;
    public static final int T__113=113;
    public static final int T__114=114;
    public static final int T__115=115;
    public static final int T__116=116;
    public static final int T__117=117;
    public static final int T__118=118;
    public static final int T__119=119;
    public static final int T__120=120;
    public static final int T__121=121;
    public static final int T__122=122;
    public static final int T__123=123;
    public static final int T__124=124;
    public static final int T__125=125;
    public static final int T__126=126;
    public static final int ANONYMOUS=4;
    public static final int ATTRIBUTE=5;
    public static final int BOOL_VAL=6;
    public static final int COLLECT=7;
    public static final int COMMENT=8;
    public static final int CONDITION=9;
    public static final int CONDITION_FUNCTION=10;
    public static final int CONSTANT=11;
    public static final int DEFINITION=12;
    public static final int EXTENSION=13;
    public static final int EXTENSION_FUNCTION=14;
    public static final int FILTER=15;
    public static final int FOLLOWED_BY=16;
    public static final int FUNCTION=17;
    public static final int HANDLERS=18;
    public static final int ID=19;
    public static final int ID_QUOTES=20;
    public static final int IN_ATTRIBUTE=21;
    public static final int IP=22;
    public static final int JOIN=23;
    public static final int LINE_COMMENT=24;
    public static final int NUM=25;
    public static final int NUM_SCI=26;
    public static final int OUT_ATTRIBUTE=27;
    public static final int OUT_ATTRIBUTES=28;
    public static final int OUT_STREAM=29;
    public static final int PARAMETERS=30;
    public static final int PATTERN=31;
    public static final int PATTERN_FULL=32;
    public static final int POSITIVE_DOUBLE_VAL=33;
    public static final int POSITIVE_FLOAT_VAL=34;
    public static final int POSITIVE_INT_VAL=35;
    public static final int POSITIVE_LONG_VAL=36;
    public static final int QUERY=37;
    public static final int REGEX=38;
    public static final int RETURN_QUERY=39;
    public static final int SEQUENCE=40;
    public static final int SEQUENCE_FULL=41;
    public static final int SIGNED_VAL=42;
    public static final int STREAM=43;
    public static final int STRING_VAL=44;
    public static final int TIME_EXP=45;
    public static final int TRANSFORM=46;
    public static final int WINDOW=47;
    public static final int WS=48;

    // delegates
    public TreeParser[] getDelegates() {
        return new TreeParser[] {};
    }

    // delegators


    public SiddhiQLGrammarWalker(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public SiddhiQLGrammarWalker(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return SiddhiQLGrammarWalker.tokenNames; }
    public String getGrammarFileName() { return "org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g"; }



    // $ANTLR start "executionPlan"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:50:1: executionPlan returns [List<ExecutionPlan> executionPlanList] : ( ^( DEFINITION definitionStream ) )* ( query )* ;
    public final List<ExecutionPlan> executionPlan() throws RecognitionException {
        List<ExecutionPlan> executionPlanList = null;


        StreamDefinition definitionStream1 =null;



                executionPlanList =new ArrayList<ExecutionPlan>();
            
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:54:2: ( ( ^( DEFINITION definitionStream ) )* ( query )* )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:54:4: ( ^( DEFINITION definitionStream ) )* ( query )*
            {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:54:4: ( ^( DEFINITION definitionStream ) )*
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case DEFINITION:
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:54:5: ^( DEFINITION definitionStream )
            	    {
            	    match(input,DEFINITION,FOLLOW_DEFINITION_in_executionPlan67); if (state.failed) return executionPlanList;

            	    match(input, Token.DOWN, null); if (state.failed) return executionPlanList;
            	    pushFollow(FOLLOW_definitionStream_in_executionPlan69);
            	    definitionStream1=definitionStream();

            	    state._fsp--;
            	    if (state.failed) return executionPlanList;

            	    if ( state.backtracking==0 ) {executionPlanList.add(definitionStream1);}

            	    match(input, Token.UP, null); if (state.failed) return executionPlanList;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:54:101: ( query )*
            loop2:
            do {
                int alt2=2;
                switch ( input.LA(1) ) {
                case QUERY:
                    {
                    alt2=1;
                    }
                    break;

                }

                switch (alt2) {
            	case 1 :
            	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:54:102: query
            	    {
            	    pushFollow(FOLLOW_query_in_executionPlan78);
            	    query();

            	    state._fsp--;
            	    if (state.failed) return executionPlanList;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return executionPlanList;
    }
    // $ANTLR end "executionPlan"



    // $ANTLR start "definitionStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:57:1: definitionStream returns [StreamDefinition streamDefinition] : ^( streamId ( ^( IN_ATTRIBUTE attributeName type ) )+ ( IP )? ) ;
    public final StreamDefinition definitionStream() throws RecognitionException {
        StreamDefinition streamDefinition = null;


        CommonTree IP5=null;
        String streamId2 =null;

        String attributeName3 =null;

        Attribute.Type type4 =null;



                streamDefinition = QueryFactory.createStreamDefinition();
            
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:61:2: ( ^( streamId ( ^( IN_ATTRIBUTE attributeName type ) )+ ( IP )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:61:5: ^( streamId ( ^( IN_ATTRIBUTE attributeName type ) )+ ( IP )? )
            {
            pushFollow(FOLLOW_streamId_in_definitionStream106);
            streamId2=streamId();

            state._fsp--;
            if (state.failed) return streamDefinition;

            if ( state.backtracking==0 ) {streamDefinition.name(streamId2);}

            match(input, Token.DOWN, null); if (state.failed) return streamDefinition;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:61:59: ( ^( IN_ATTRIBUTE attributeName type ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                switch ( input.LA(1) ) {
                case IN_ATTRIBUTE:
                    {
                    alt3=1;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:61:60: ^( IN_ATTRIBUTE attributeName type )
            	    {
            	    match(input,IN_ATTRIBUTE,FOLLOW_IN_ATTRIBUTE_in_definitionStream112); if (state.failed) return streamDefinition;

            	    match(input, Token.DOWN, null); if (state.failed) return streamDefinition;
            	    pushFollow(FOLLOW_attributeName_in_definitionStream114);
            	    attributeName3=attributeName();

            	    state._fsp--;
            	    if (state.failed) return streamDefinition;

            	    pushFollow(FOLLOW_type_in_definitionStream116);
            	    type4=type();

            	    state._fsp--;
            	    if (state.failed) return streamDefinition;

            	    if ( state.backtracking==0 ) {streamDefinition.attribute(attributeName3, type4);}

            	    match(input, Token.UP, null); if (state.failed) return streamDefinition;


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return streamDefinition;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:61:164: ( IP )?
            int alt4=2;
            switch ( input.LA(1) ) {
                case IP:
                    {
                    alt4=1;
                    }
                    break;
            }

            switch (alt4) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:61:165: IP
                    {
                    IP5=(CommonTree)match(input,IP,FOLLOW_IP_in_definitionStream126); if (state.failed) return streamDefinition;

                    if ( state.backtracking==0 ) {streamDefinition.ip((IP5!=null?IP5.getText():null));}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return streamDefinition;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return streamDefinition;
    }
    // $ANTLR end "definitionStream"



    // $ANTLR start "query"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:64:1: query returns [Query query] : ( ^( QUERY outputStream inputStream outputProjection ) | ^( QUERY inputStream outputProjection ) );
    public final Query query() throws RecognitionException {
        Query query = null;


        OutStream outputStream6 =null;

        Stream inputStream7 =null;

        Projector outputProjection8 =null;

        Stream inputStream9 =null;

        Projector outputProjection10 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:65:2: ( ^( QUERY outputStream inputStream outputProjection ) | ^( QUERY inputStream outputProjection ) )
            int alt5=2;
            switch ( input.LA(1) ) {
            case QUERY:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case OUT_STREAM:
                        {
                        alt5=1;
                        }
                        break;
                    case JOIN:
                    case PATTERN_FULL:
                    case SEQUENCE_FULL:
                    case STREAM:
                        {
                        alt5=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return query;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return query;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return query;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:65:4: ^( QUERY outputStream inputStream outputProjection )
                    {
                    match(input,QUERY,FOLLOW_QUERY_in_query147); if (state.failed) return query;

                    match(input, Token.DOWN, null); if (state.failed) return query;
                    pushFollow(FOLLOW_outputStream_in_query149);
                    outputStream6=outputStream();

                    state._fsp--;
                    if (state.failed) return query;

                    pushFollow(FOLLOW_inputStream_in_query151);
                    inputStream7=inputStream();

                    state._fsp--;
                    if (state.failed) return query;

                    pushFollow(FOLLOW_outputProjection_in_query153);
                    outputProjection8=outputProjection();

                    state._fsp--;
                    if (state.failed) return query;

                    match(input, Token.UP, null); if (state.failed) return query;


                    if ( state.backtracking==0 ) {query = QueryFactory.createQuery().outStream(outputStream6).
                    																						from(inputStream7).
                    																						project(outputProjection8);}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:68:4: ^( QUERY inputStream outputProjection )
                    {
                    match(input,QUERY,FOLLOW_QUERY_in_query163); if (state.failed) return query;

                    match(input, Token.DOWN, null); if (state.failed) return query;
                    pushFollow(FOLLOW_inputStream_in_query165);
                    inputStream9=inputStream();

                    state._fsp--;
                    if (state.failed) return query;

                    pushFollow(FOLLOW_outputProjection_in_query167);
                    outputProjection10=outputProjection();

                    state._fsp--;
                    if (state.failed) return query;

                    match(input, Token.UP, null); if (state.failed) return query;


                    if ( state.backtracking==0 ) {query = QueryFactory.createQuery().from(inputStream9).
                    																						project(outputProjection10);}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return query;
    }
    // $ANTLR end "query"



    // $ANTLR start "outputStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:72:1: outputStream returns [OutStream value] : ^( OUT_STREAM streamId ( outputType )? ( ( IP )+ )? ) ;
    public final OutStream outputStream() throws RecognitionException {
        OutStream value = null;


        CommonTree IP13=null;
        String streamId11 =null;

        OutStream.OutputEvents outputType12 =null;



               		ArrayList<String> ipList=new ArrayList<String>();
            
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:79:5: ( ^( OUT_STREAM streamId ( outputType )? ( ( IP )+ )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:79:8: ^( OUT_STREAM streamId ( outputType )? ( ( IP )+ )? )
            {
            match(input,OUT_STREAM,FOLLOW_OUT_STREAM_in_outputStream204); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_streamId_in_outputStream206);
            streamId11=streamId();

            state._fsp--;
            if (state.failed) return value;

            if ( state.backtracking==0 ) {value =new OutStream(streamId11);}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:79:71: ( outputType )?
            int alt6=2;
            switch ( input.LA(1) ) {
                case 72:
                case 79:
                case 85:
                    {
                    alt6=1;
                    }
                    break;
            }

            switch (alt6) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:79:72: outputType
                    {
                    pushFollow(FOLLOW_outputType_in_outputStream211);
                    outputType12=outputType();

                    state._fsp--;
                    if (state.failed) return value;

                    if ( state.backtracking==0 ) {value =new OutStream(streamId11,outputType12);}

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:79:149: ( ( IP )+ )?
            int alt8=2;
            switch ( input.LA(1) ) {
                case IP:
                    {
                    alt8=1;
                    }
                    break;
            }

            switch (alt8) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:79:150: ( IP )+
                    {
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:79:150: ( IP )+
                    int cnt7=0;
                    loop7:
                    do {
                        int alt7=2;
                        switch ( input.LA(1) ) {
                        case IP:
                            {
                            alt7=1;
                            }
                            break;

                        }

                        switch (alt7) {
                    	case 1 :
                    	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:79:151: IP
                    	    {
                    	    IP13=(CommonTree)match(input,IP,FOLLOW_IP_in_outputStream219); if (state.failed) return value;

                    	    if ( state.backtracking==0 ) {ipList.add((IP13!=null?IP13.getText():null));}

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt7 >= 1 ) break loop7;
                    	    if (state.backtracking>0) {state.failed=true; return value;}
                                EarlyExitException eee =
                                    new EarlyExitException(7, input);
                                throw eee;
                        }
                        cnt7++;
                    } while (true);


                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return value;


            }

            if ( state.backtracking==0 ) {
                   		value =value.setIp(ipList);
                }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "outputStream"



    // $ANTLR start "outputType"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:82:1: outputType returns [OutStream.OutputEvents outputType] : ( 'expired-events' | 'current-events' | 'all-events' );
    public final OutStream.OutputEvents outputType() throws RecognitionException {
        OutStream.OutputEvents outputType = null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:83:2: ( 'expired-events' | 'current-events' | 'all-events' )
            int alt9=3;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt9=1;
                }
                break;
            case 79:
                {
                alt9=2;
                }
                break;
            case 72:
                {
                alt9=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return outputType;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }

            switch (alt9) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:83:4: 'expired-events'
                    {
                    match(input,85,FOLLOW_85_in_outputType244); if (state.failed) return outputType;

                    if ( state.backtracking==0 ) {outputType =OutStream.OutputEvents.EXPIRED_EVENTS;}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:84:4: 'current-events'
                    {
                    match(input,79,FOLLOW_79_in_outputType251); if (state.failed) return outputType;

                    if ( state.backtracking==0 ) {outputType =OutStream.OutputEvents.CURRENT_EVENTS;}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:85:4: 'all-events'
                    {
                    match(input,72,FOLLOW_72_in_outputType258); if (state.failed) return outputType;

                    if ( state.backtracking==0 ) {outputType =OutStream.OutputEvents.ALL_EVENTS;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return outputType;
    }
    // $ANTLR end "outputType"



    // $ANTLR start "inputStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:88:1: inputStream returns [Stream inStream] : ( ^( SEQUENCE_FULL sequenceFullStream ) | ^( PATTERN_FULL patternFullStream ) | ^( JOIN joinStream ) | windowStream | basicStream );
    public final Stream inputStream() throws RecognitionException {
        Stream inStream = null;


        SequenceStream sequenceFullStream14 =null;

        PatternStream patternFullStream15 =null;

        Stream joinStream16 =null;

        SingleStream windowStream17 =null;

        BasicStream basicStream18 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:89:2: ( ^( SEQUENCE_FULL sequenceFullStream ) | ^( PATTERN_FULL patternFullStream ) | ^( JOIN joinStream ) | windowStream | basicStream )
            int alt10=5;
            switch ( input.LA(1) ) {
            case SEQUENCE_FULL:
                {
                alt10=1;
                }
                break;
            case PATTERN_FULL:
                {
                alt10=2;
                }
                break;
            case JOIN:
                {
                alt10=3;
                }
                break;
            case STREAM:
                {
                int LA10_4 = input.LA(2);

                if ( (synpred14_SiddhiQLGrammarWalker()) ) {
                    alt10=4;
                }
                else if ( (true) ) {
                    alt10=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return inStream;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return inStream;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }

            switch (alt10) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:89:4: ^( SEQUENCE_FULL sequenceFullStream )
                    {
                    match(input,SEQUENCE_FULL,FOLLOW_SEQUENCE_FULL_in_inputStream280); if (state.failed) return inStream;

                    match(input, Token.DOWN, null); if (state.failed) return inStream;
                    pushFollow(FOLLOW_sequenceFullStream_in_inputStream282);
                    sequenceFullStream14=sequenceFullStream();

                    state._fsp--;
                    if (state.failed) return inStream;

                    match(input, Token.UP, null); if (state.failed) return inStream;


                    if ( state.backtracking==0 ) {inStream =sequenceFullStream14;}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:90:4: ^( PATTERN_FULL patternFullStream )
                    {
                    match(input,PATTERN_FULL,FOLLOW_PATTERN_FULL_in_inputStream291); if (state.failed) return inStream;

                    match(input, Token.DOWN, null); if (state.failed) return inStream;
                    pushFollow(FOLLOW_patternFullStream_in_inputStream294);
                    patternFullStream15=patternFullStream();

                    state._fsp--;
                    if (state.failed) return inStream;

                    match(input, Token.UP, null); if (state.failed) return inStream;


                    if ( state.backtracking==0 ) {inStream =patternFullStream15;}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:91:4: ^( JOIN joinStream )
                    {
                    match(input,JOIN,FOLLOW_JOIN_in_inputStream304); if (state.failed) return inStream;

                    match(input, Token.DOWN, null); if (state.failed) return inStream;
                    pushFollow(FOLLOW_joinStream_in_inputStream306);
                    joinStream16=joinStream();

                    state._fsp--;
                    if (state.failed) return inStream;

                    match(input, Token.UP, null); if (state.failed) return inStream;


                    if ( state.backtracking==0 ) {inStream =joinStream16;}

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:92:4: windowStream
                    {
                    pushFollow(FOLLOW_windowStream_in_inputStream315);
                    windowStream17=windowStream();

                    state._fsp--;
                    if (state.failed) return inStream;

                    if ( state.backtracking==0 ) {inStream =windowStream17;}

                    }
                    break;
                case 5 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:93:4: basicStream
                    {
                    pushFollow(FOLLOW_basicStream_in_inputStream331);
                    basicStream18=basicStream();

                    state._fsp--;
                    if (state.failed) return inStream;

                    if ( state.backtracking==0 ) {inStream =basicStream18;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return inStream;
    }
    // $ANTLR end "inputStream"



    // $ANTLR start "basicStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:96:1: basicStream returns [BasicStream basicStream] : ^( STREAM rawStream ( transformHandler )? ( id )? ) ;
    public final BasicStream basicStream() throws RecognitionException {
        BasicStream basicStream = null;


        BasicStream rawStream19 =null;

        Transformer transformHandler20 =null;

        String id21 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:97:2: ( ^( STREAM rawStream ( transformHandler )? ( id )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:97:4: ^( STREAM rawStream ( transformHandler )? ( id )? )
            {
            match(input,STREAM,FOLLOW_STREAM_in_basicStream362); if (state.failed) return basicStream;

            match(input, Token.DOWN, null); if (state.failed) return basicStream;
            pushFollow(FOLLOW_rawStream_in_basicStream364);
            rawStream19=rawStream();

            state._fsp--;
            if (state.failed) return basicStream;

            if ( state.backtracking==0 ) {basicStream =rawStream19;}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:97:60: ( transformHandler )?
            int alt11=2;
            switch ( input.LA(1) ) {
                case TRANSFORM:
                    {
                    alt11=1;
                    }
                    break;
            }

            switch (alt11) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:97:61: transformHandler
                    {
                    pushFollow(FOLLOW_transformHandler_in_basicStream369);
                    transformHandler20=transformHandler();

                    state._fsp--;
                    if (state.failed) return basicStream;

                    if ( state.backtracking==0 ) {basicStream.setTransformer(transformHandler20);}

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:97:142: ( id )?
            int alt12=2;
            switch ( input.LA(1) ) {
                case ID:
                case ID_QUOTES:
                    {
                    alt12=1;
                    }
                    break;
            }

            switch (alt12) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:97:143: id
                    {
                    pushFollow(FOLLOW_id_in_basicStream376);
                    id21=id();

                    state._fsp--;
                    if (state.failed) return basicStream;

                    if ( state.backtracking==0 ) {basicStream.setStreamReferenceId(id21);}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return basicStream;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return basicStream;
    }
    // $ANTLR end "basicStream"



    // $ANTLR start "windowStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:100:1: windowStream returns [SingleStream singleStream] : ( ^( STREAM ^( ANONYMOUS returnQuery ( filterHandler )? ( transformHandler )? windowHandler ) ( id )? ) | ^( STREAM ^( streamId ( filterHandler )? ( transformHandler )? windowHandler ) ( id )? ) );
    public final SingleStream windowStream() throws RecognitionException {
        SingleStream singleStream = null;


        BasicStream returnQuery22 =null;

        Filter filterHandler23 =null;

        Transformer transformHandler24 =null;

        Window windowHandler25 =null;

        String id26 =null;

        String streamId27 =null;

        Filter filterHandler28 =null;

        Transformer transformHandler29 =null;

        Window windowHandler30 =null;

        String id31 =null;



        		BasicStream rawStream=null;
        	
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:104:2: ( ^( STREAM ^( ANONYMOUS returnQuery ( filterHandler )? ( transformHandler )? windowHandler ) ( id )? ) | ^( STREAM ^( streamId ( filterHandler )? ( transformHandler )? windowHandler ) ( id )? ) )
            int alt19=2;
            switch ( input.LA(1) ) {
            case STREAM:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case ANONYMOUS:
                        {
                        alt19=1;
                        }
                        break;
                    case ID:
                    case ID_QUOTES:
                        {
                        alt19=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return singleStream;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return singleStream;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return singleStream;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:104:4: ^( STREAM ^( ANONYMOUS returnQuery ( filterHandler )? ( transformHandler )? windowHandler ) ( id )? )
                    {
                    match(input,STREAM,FOLLOW_STREAM_in_windowStream405); if (state.failed) return singleStream;

                    match(input, Token.DOWN, null); if (state.failed) return singleStream;
                    match(input,ANONYMOUS,FOLLOW_ANONYMOUS_in_windowStream409); if (state.failed) return singleStream;

                    match(input, Token.DOWN, null); if (state.failed) return singleStream;
                    pushFollow(FOLLOW_returnQuery_in_windowStream411);
                    returnQuery22=returnQuery();

                    state._fsp--;
                    if (state.failed) return singleStream;

                    if ( state.backtracking==0 ) {rawStream=returnQuery22;}

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:104:71: ( filterHandler )?
                    int alt13=2;
                    switch ( input.LA(1) ) {
                        case FILTER:
                            {
                            alt13=1;
                            }
                            break;
                    }

                    switch (alt13) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:104:72: filterHandler
                            {
                            pushFollow(FOLLOW_filterHandler_in_windowStream416);
                            filterHandler23=filterHandler();

                            state._fsp--;
                            if (state.failed) return singleStream;

                            if ( state.backtracking==0 ) {rawStream.setFilter(filterHandler23);}

                            }
                            break;

                    }


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:104:134: ( transformHandler )?
                    int alt14=2;
                    switch ( input.LA(1) ) {
                        case TRANSFORM:
                            {
                            alt14=1;
                            }
                            break;
                    }

                    switch (alt14) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:104:135: transformHandler
                            {
                            pushFollow(FOLLOW_transformHandler_in_windowStream423);
                            transformHandler24=transformHandler();

                            state._fsp--;
                            if (state.failed) return singleStream;

                            if ( state.backtracking==0 ) {rawStream.setTransformer(transformHandler24);}

                            }
                            break;

                    }


                    pushFollow(FOLLOW_windowHandler_in_windowStream430);
                    windowHandler25=windowHandler();

                    state._fsp--;
                    if (state.failed) return singleStream;

                    if ( state.backtracking==0 ) {singleStream =rawStream.window(windowHandler25);}

                    match(input, Token.UP, null); if (state.failed) return singleStream;


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:104:287: ( id )?
                    int alt15=2;
                    switch ( input.LA(1) ) {
                        case ID:
                        case ID_QUOTES:
                            {
                            alt15=1;
                            }
                            break;
                    }

                    switch (alt15) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:104:288: id
                            {
                            pushFollow(FOLLOW_id_in_windowStream437);
                            id26=id();

                            state._fsp--;
                            if (state.failed) return singleStream;

                            if ( state.backtracking==0 ) {singleStream.setStreamReferenceId(id26);}

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return singleStream;


                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:105:4: ^( STREAM ^( streamId ( filterHandler )? ( transformHandler )? windowHandler ) ( id )? )
                    {
                    match(input,STREAM,FOLLOW_STREAM_in_windowStream448); if (state.failed) return singleStream;

                    match(input, Token.DOWN, null); if (state.failed) return singleStream;
                    pushFollow(FOLLOW_streamId_in_windowStream452);
                    streamId27=streamId();

                    state._fsp--;
                    if (state.failed) return singleStream;

                    if ( state.backtracking==0 ) {rawStream=QueryFactory.inputStream(streamId27);}

                    match(input, Token.DOWN, null); if (state.failed) return singleStream;
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:105:80: ( filterHandler )?
                    int alt16=2;
                    switch ( input.LA(1) ) {
                        case FILTER:
                            {
                            alt16=1;
                            }
                            break;
                    }

                    switch (alt16) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:105:81: filterHandler
                            {
                            pushFollow(FOLLOW_filterHandler_in_windowStream457);
                            filterHandler28=filterHandler();

                            state._fsp--;
                            if (state.failed) return singleStream;

                            if ( state.backtracking==0 ) {rawStream.setFilter(filterHandler28);}

                            }
                            break;

                    }


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:105:143: ( transformHandler )?
                    int alt17=2;
                    switch ( input.LA(1) ) {
                        case TRANSFORM:
                            {
                            alt17=1;
                            }
                            break;
                    }

                    switch (alt17) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:105:144: transformHandler
                            {
                            pushFollow(FOLLOW_transformHandler_in_windowStream464);
                            transformHandler29=transformHandler();

                            state._fsp--;
                            if (state.failed) return singleStream;

                            if ( state.backtracking==0 ) {rawStream.setTransformer(transformHandler29);}

                            }
                            break;

                    }


                    pushFollow(FOLLOW_windowHandler_in_windowStream471);
                    windowHandler30=windowHandler();

                    state._fsp--;
                    if (state.failed) return singleStream;

                    if ( state.backtracking==0 ) {singleStream =rawStream.window(windowHandler30);}

                    match(input, Token.UP, null); if (state.failed) return singleStream;


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:105:296: ( id )?
                    int alt18=2;
                    switch ( input.LA(1) ) {
                        case ID:
                        case ID_QUOTES:
                            {
                            alt18=1;
                            }
                            break;
                    }

                    switch (alt18) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:105:297: id
                            {
                            pushFollow(FOLLOW_id_in_windowStream478);
                            id31=id();

                            state._fsp--;
                            if (state.failed) return singleStream;

                            if ( state.backtracking==0 ) {singleStream.setStreamReferenceId(id31);}

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return singleStream;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return singleStream;
    }
    // $ANTLR end "windowStream"



    // $ANTLR start "rawStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:108:1: rawStream returns [BasicStream rawStream] : ( ^( ANONYMOUS returnQuery ( filterHandler )? ) | ^( streamId ( filterHandler )? ) );
    public final BasicStream rawStream() throws RecognitionException {
        BasicStream rawStream = null;


        BasicStream returnQuery32 =null;

        Filter filterHandler33 =null;

        String streamId34 =null;

        Filter filterHandler35 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:109:2: ( ^( ANONYMOUS returnQuery ( filterHandler )? ) | ^( streamId ( filterHandler )? ) )
            int alt22=2;
            switch ( input.LA(1) ) {
            case ANONYMOUS:
                {
                alt22=1;
                }
                break;
            case ID:
            case ID_QUOTES:
                {
                alt22=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return rawStream;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:109:4: ^( ANONYMOUS returnQuery ( filterHandler )? )
                    {
                    match(input,ANONYMOUS,FOLLOW_ANONYMOUS_in_rawStream500); if (state.failed) return rawStream;

                    match(input, Token.DOWN, null); if (state.failed) return rawStream;
                    pushFollow(FOLLOW_returnQuery_in_rawStream502);
                    returnQuery32=returnQuery();

                    state._fsp--;
                    if (state.failed) return rawStream;

                    if ( state.backtracking==0 ) {rawStream =returnQuery32;}

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:109:63: ( filterHandler )?
                    int alt20=2;
                    switch ( input.LA(1) ) {
                        case FILTER:
                            {
                            alt20=1;
                            }
                            break;
                    }

                    switch (alt20) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:109:64: filterHandler
                            {
                            pushFollow(FOLLOW_filterHandler_in_rawStream507);
                            filterHandler33=filterHandler();

                            state._fsp--;
                            if (state.failed) return rawStream;

                            if ( state.backtracking==0 ) {rawStream.setFilter(filterHandler33);}

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return rawStream;


                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:110:4: ^( streamId ( filterHandler )? )
                    {
                    pushFollow(FOLLOW_streamId_in_rawStream520);
                    streamId34=streamId();

                    state._fsp--;
                    if (state.failed) return rawStream;

                    if ( state.backtracking==0 ) {rawStream =QueryFactory.inputStream(streamId34);}

                    if ( input.LA(1)==Token.DOWN ) {
                        match(input, Token.DOWN, null); if (state.failed) return rawStream;
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:110:71: ( filterHandler )?
                        int alt21=2;
                        switch ( input.LA(1) ) {
                            case FILTER:
                                {
                                alt21=1;
                                }
                                break;
                        }

                        switch (alt21) {
                            case 1 :
                                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:110:72: filterHandler
                                {
                                pushFollow(FOLLOW_filterHandler_in_rawStream525);
                                filterHandler35=filterHandler();

                                state._fsp--;
                                if (state.failed) return rawStream;

                                if ( state.backtracking==0 ) {rawStream.setFilter(filterHandler35);}

                                }
                                break;

                        }


                        match(input, Token.UP, null); if (state.failed) return rawStream;
                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return rawStream;
    }
    // $ANTLR end "rawStream"


    protected static class joinStream_scope {
        Condition onCondition;
        Expression within;
    }
    protected Stack joinStream_stack = new Stack();



    // $ANTLR start "joinStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:113:1: joinStream returns [Stream stream] : ( leftStream join rightStream 'unidirectional' ( condition )? ( time )? | leftStream join rightStream ( condition )? ( time )? | leftStream 'unidirectional' join rightStream ( condition )? ( time )? );
    public final Stream joinStream() throws RecognitionException {
        joinStream_stack.push(new joinStream_scope());
        Stream stream = null;


        Condition condition36 =null;

        Expression time37 =null;

        SingleStream leftStream38 =null;

        JoinStream.Type join39 =null;

        SingleStream rightStream40 =null;

        Condition condition41 =null;

        Expression time42 =null;

        SingleStream leftStream43 =null;

        JoinStream.Type join44 =null;

        SingleStream rightStream45 =null;

        Condition condition46 =null;

        Expression time47 =null;

        SingleStream leftStream48 =null;

        JoinStream.Type join49 =null;

        SingleStream rightStream50 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:118:2: ( leftStream join rightStream 'unidirectional' ( condition )? ( time )? | leftStream join rightStream ( condition )? ( time )? | leftStream 'unidirectional' join rightStream ( condition )? ( time )? )
            int alt29=3;
            switch ( input.LA(1) ) {
            case STREAM:
                {
                int LA29_1 = input.LA(2);

                if ( (synpred29_SiddhiQLGrammarWalker()) ) {
                    alt29=1;
                }
                else if ( (synpred32_SiddhiQLGrammarWalker()) ) {
                    alt29=2;
                }
                else if ( (true) ) {
                    alt29=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return stream;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 29, 1, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return stream;}
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:118:4: leftStream join rightStream 'unidirectional' ( condition )? ( time )?
                    {
                    pushFollow(FOLLOW_leftStream_in_joinStream551);
                    leftStream38=leftStream();

                    state._fsp--;
                    if (state.failed) return stream;

                    pushFollow(FOLLOW_join_in_joinStream554);
                    join39=join();

                    state._fsp--;
                    if (state.failed) return stream;

                    pushFollow(FOLLOW_rightStream_in_joinStream556);
                    rightStream40=rightStream();

                    state._fsp--;
                    if (state.failed) return stream;

                    match(input,120,FOLLOW_120_in_joinStream558); if (state.failed) return stream;

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:118:50: ( condition )?
                    int alt23=2;
                    switch ( input.LA(1) ) {
                        case CONDITION:
                            {
                            alt23=1;
                            }
                            break;
                    }

                    switch (alt23) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:118:51: condition
                            {
                            pushFollow(FOLLOW_condition_in_joinStream561);
                            condition36=condition();

                            state._fsp--;
                            if (state.failed) return stream;

                            if ( state.backtracking==0 ) {((joinStream_scope)joinStream_stack.peek()).onCondition =condition36;}

                            }
                            break;

                    }


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:118:112: ( time )?
                    int alt24=2;
                    switch ( input.LA(1) ) {
                        case CONSTANT:
                            {
                            alt24=1;
                            }
                            break;
                    }

                    switch (alt24) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:118:113: time
                            {
                            pushFollow(FOLLOW_time_in_joinStream568);
                            time37=time();

                            state._fsp--;
                            if (state.failed) return stream;

                            if ( state.backtracking==0 ) {((joinStream_scope)joinStream_stack.peek()).within =time37;}

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { stream=QueryFactory.joinStream(leftStream38,join39,rightStream40,((joinStream_scope)joinStream_stack.peek()).onCondition,(Constant)((joinStream_scope)joinStream_stack.peek()).within,JoinStream.EventTrigger.RIGHT);}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:119:4: leftStream join rightStream ( condition )? ( time )?
                    {
                    pushFollow(FOLLOW_leftStream_in_joinStream579);
                    leftStream43=leftStream();

                    state._fsp--;
                    if (state.failed) return stream;

                    pushFollow(FOLLOW_join_in_joinStream581);
                    join44=join();

                    state._fsp--;
                    if (state.failed) return stream;

                    pushFollow(FOLLOW_rightStream_in_joinStream583);
                    rightStream45=rightStream();

                    state._fsp--;
                    if (state.failed) return stream;

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:119:32: ( condition )?
                    int alt25=2;
                    switch ( input.LA(1) ) {
                        case CONDITION:
                            {
                            alt25=1;
                            }
                            break;
                    }

                    switch (alt25) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:119:33: condition
                            {
                            pushFollow(FOLLOW_condition_in_joinStream586);
                            condition41=condition();

                            state._fsp--;
                            if (state.failed) return stream;

                            if ( state.backtracking==0 ) {((joinStream_scope)joinStream_stack.peek()).onCondition =condition41;}

                            }
                            break;

                    }


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:119:94: ( time )?
                    int alt26=2;
                    switch ( input.LA(1) ) {
                        case CONSTANT:
                            {
                            alt26=1;
                            }
                            break;
                    }

                    switch (alt26) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:119:95: time
                            {
                            pushFollow(FOLLOW_time_in_joinStream593);
                            time42=time();

                            state._fsp--;
                            if (state.failed) return stream;

                            if ( state.backtracking==0 ) {((joinStream_scope)joinStream_stack.peek()).within =time42;}

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { stream=QueryFactory.joinStream(leftStream43,join44,rightStream45,((joinStream_scope)joinStream_stack.peek()).onCondition,(Constant)((joinStream_scope)joinStream_stack.peek()).within);}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:120:4: leftStream 'unidirectional' join rightStream ( condition )? ( time )?
                    {
                    pushFollow(FOLLOW_leftStream_in_joinStream610);
                    leftStream48=leftStream();

                    state._fsp--;
                    if (state.failed) return stream;

                    match(input,120,FOLLOW_120_in_joinStream612); if (state.failed) return stream;

                    pushFollow(FOLLOW_join_in_joinStream615);
                    join49=join();

                    state._fsp--;
                    if (state.failed) return stream;

                    pushFollow(FOLLOW_rightStream_in_joinStream617);
                    rightStream50=rightStream();

                    state._fsp--;
                    if (state.failed) return stream;

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:120:50: ( condition )?
                    int alt27=2;
                    switch ( input.LA(1) ) {
                        case CONDITION:
                            {
                            alt27=1;
                            }
                            break;
                    }

                    switch (alt27) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:120:51: condition
                            {
                            pushFollow(FOLLOW_condition_in_joinStream620);
                            condition46=condition();

                            state._fsp--;
                            if (state.failed) return stream;

                            if ( state.backtracking==0 ) {((joinStream_scope)joinStream_stack.peek()).onCondition =condition46;}

                            }
                            break;

                    }


                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:120:112: ( time )?
                    int alt28=2;
                    switch ( input.LA(1) ) {
                        case CONSTANT:
                            {
                            alt28=1;
                            }
                            break;
                    }

                    switch (alt28) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:120:113: time
                            {
                            pushFollow(FOLLOW_time_in_joinStream627);
                            time47=time();

                            state._fsp--;
                            if (state.failed) return stream;

                            if ( state.backtracking==0 ) {((joinStream_scope)joinStream_stack.peek()).within =time47;}

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { stream=QueryFactory.joinStream(leftStream48,join49,rightStream50,((joinStream_scope)joinStream_stack.peek()).onCondition,(Constant)((joinStream_scope)joinStream_stack.peek()).within,JoinStream.EventTrigger.LEFT);}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            joinStream_stack.pop();
        }
        return stream;
    }
    // $ANTLR end "joinStream"



    // $ANTLR start "leftStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:123:1: leftStream returns [SingleStream singleStream] : ( windowStream | basicStream );
    public final SingleStream leftStream() throws RecognitionException {
        SingleStream singleStream = null;


        SingleStream windowStream51 =null;

        BasicStream basicStream52 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:124:5: ( windowStream | basicStream )
            int alt30=2;
            switch ( input.LA(1) ) {
            case STREAM:
                {
                int LA30_1 = input.LA(2);

                if ( (synpred35_SiddhiQLGrammarWalker()) ) {
                    alt30=1;
                }
                else if ( (true) ) {
                    alt30=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return singleStream;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 30, 1, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return singleStream;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }

            switch (alt30) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:124:8: windowStream
                    {
                    pushFollow(FOLLOW_windowStream_in_leftStream652);
                    windowStream51=windowStream();

                    state._fsp--;
                    if (state.failed) return singleStream;

                    if ( state.backtracking==0 ) {singleStream =windowStream51;}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:125:8: basicStream
                    {
                    pushFollow(FOLLOW_basicStream_in_leftStream663);
                    basicStream52=basicStream();

                    state._fsp--;
                    if (state.failed) return singleStream;

                    if ( state.backtracking==0 ) {singleStream =basicStream52;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return singleStream;
    }
    // $ANTLR end "leftStream"



    // $ANTLR start "rightStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:128:1: rightStream returns [SingleStream singleStream] : ( windowStream | basicStream );
    public final SingleStream rightStream() throws RecognitionException {
        SingleStream singleStream = null;


        SingleStream windowStream53 =null;

        BasicStream basicStream54 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:129:5: ( windowStream | basicStream )
            int alt31=2;
            switch ( input.LA(1) ) {
            case STREAM:
                {
                int LA31_1 = input.LA(2);

                if ( (synpred36_SiddhiQLGrammarWalker()) ) {
                    alt31=1;
                }
                else if ( (true) ) {
                    alt31=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return singleStream;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return singleStream;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:129:8: windowStream
                    {
                    pushFollow(FOLLOW_windowStream_in_rightStream688);
                    windowStream53=windowStream();

                    state._fsp--;
                    if (state.failed) return singleStream;

                    if ( state.backtracking==0 ) {singleStream =windowStream53;}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:130:8: basicStream
                    {
                    pushFollow(FOLLOW_basicStream_in_rightStream699);
                    basicStream54=basicStream();

                    state._fsp--;
                    if (state.failed) return singleStream;

                    if ( state.backtracking==0 ) {singleStream =basicStream54;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return singleStream;
    }
    // $ANTLR end "rightStream"



    // $ANTLR start "returnQuery"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:133:1: returnQuery returns [BasicStream stream] : ^( RETURN_QUERY inputStream outputProjection ) ;
    public final BasicStream returnQuery() throws RecognitionException {
        BasicStream stream = null;


        Stream inputStream55 =null;

        Projector outputProjection56 =null;



        		System.err.println("Return Query not yet supported!");
        	
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:137:2: ( ^( RETURN_QUERY inputStream outputProjection ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:137:4: ^( RETURN_QUERY inputStream outputProjection )
            {
            match(input,RETURN_QUERY,FOLLOW_RETURN_QUERY_in_returnQuery727); if (state.failed) return stream;

            match(input, Token.DOWN, null); if (state.failed) return stream;
            pushFollow(FOLLOW_inputStream_in_returnQuery730);
            inputStream55=inputStream();

            state._fsp--;
            if (state.failed) return stream;

            pushFollow(FOLLOW_outputProjection_in_returnQuery732);
            outputProjection56=outputProjection();

            state._fsp--;
            if (state.failed) return stream;

            match(input, Token.UP, null); if (state.failed) return stream;


            if ( state.backtracking==0 ) {stream=QueryFactory.createQuery().from(inputStream55).project(outputProjection56).returnStream();}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return stream;
    }
    // $ANTLR end "returnQuery"



    // $ANTLR start "patternFullStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:140:1: patternFullStream returns [PatternStream stream] : ^( PATTERN patternStream ( time )? ) ;
    public final PatternStream patternFullStream() throws RecognitionException {
        PatternStream stream = null;


        PatternElement patternStream57 =null;

        Expression time58 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:141:2: ( ^( PATTERN patternStream ( time )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:141:4: ^( PATTERN patternStream ( time )? )
            {
            match(input,PATTERN,FOLLOW_PATTERN_in_patternFullStream751); if (state.failed) return stream;

            match(input, Token.DOWN, null); if (state.failed) return stream;
            pushFollow(FOLLOW_patternStream_in_patternFullStream754);
            patternStream57=patternStream();

            state._fsp--;
            if (state.failed) return stream;

            if ( state.backtracking==0 ) {stream= QueryFactory.patternStream(patternStream57);}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:141:91: ( time )?
            int alt32=2;
            switch ( input.LA(1) ) {
                case CONSTANT:
                    {
                    alt32=1;
                    }
                    break;
            }

            switch (alt32) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:141:92: time
                    {
                    pushFollow(FOLLOW_time_in_patternFullStream759);
                    time58=time();

                    state._fsp--;
                    if (state.failed) return stream;

                    if ( state.backtracking==0 ) {stream= QueryFactory.patternStream(patternStream57,(Constant)time58);}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return stream;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return stream;
    }
    // $ANTLR end "patternFullStream"



    // $ANTLR start "patternStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:144:1: patternStream returns [PatternElement element] : ( ^( 'every' patternItem ) (p= patternStream )? | ^( 'every' nonEveryPatternStream ) (p= patternStream )? | patternItem (p= patternStream )? );
    public final PatternElement patternStream() throws RecognitionException {
        PatternElement element = null;


        PatternElement p =null;

        PatternElement patternItem59 =null;

        PatternElement nonEveryPatternStream60 =null;

        PatternElement patternItem61 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:145:2: ( ^( 'every' patternItem ) (p= patternStream )? | ^( 'every' nonEveryPatternStream ) (p= patternStream )? | patternItem (p= patternStream )? )
            int alt36=3;
            switch ( input.LA(1) ) {
            case 84:
                {
                int LA36_1 = input.LA(2);

                if ( (synpred39_SiddhiQLGrammarWalker()) ) {
                    alt36=1;
                }
                else if ( (synpred41_SiddhiQLGrammarWalker()) ) {
                    alt36=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return element;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;

                }
                }
                break;
            case COLLECT:
            case STREAM:
            case 73:
            case 110:
                {
                alt36=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }

            switch (alt36) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:145:4: ^( 'every' patternItem ) (p= patternStream )?
                    {
                    match(input,84,FOLLOW_84_in_patternStream782); if (state.failed) return element;

                    match(input, Token.DOWN, null); if (state.failed) return element;
                    pushFollow(FOLLOW_patternItem_in_patternStream785);
                    patternItem59=patternItem();

                    state._fsp--;
                    if (state.failed) return element;

                    match(input, Token.UP, null); if (state.failed) return element;


                    if ( state.backtracking==0 ) {element =Pattern.every(patternItem59);}

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:145:76: (p= patternStream )?
                    int alt33=2;
                    switch ( input.LA(1) ) {
                        case COLLECT:
                        case STREAM:
                        case 73:
                        case 84:
                        case 110:
                            {
                            alt33=1;
                            }
                            break;
                    }

                    switch (alt33) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:145:77: p= patternStream
                            {
                            pushFollow(FOLLOW_patternStream_in_patternStream793);
                            p=patternStream();

                            state._fsp--;
                            if (state.failed) return element;

                            if ( state.backtracking==0 ) {element =Pattern.followedBy(element,p);}

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:146:4: ^( 'every' nonEveryPatternStream ) (p= patternStream )?
                    {
                    match(input,84,FOLLOW_84_in_patternStream803); if (state.failed) return element;

                    match(input, Token.DOWN, null); if (state.failed) return element;
                    pushFollow(FOLLOW_nonEveryPatternStream_in_patternStream805);
                    nonEveryPatternStream60=nonEveryPatternStream();

                    state._fsp--;
                    if (state.failed) return element;

                    match(input, Token.UP, null); if (state.failed) return element;


                    if ( state.backtracking==0 ) {element =Pattern.every(nonEveryPatternStream60);}

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:146:98: (p= patternStream )?
                    int alt34=2;
                    switch ( input.LA(1) ) {
                        case COLLECT:
                        case STREAM:
                        case 73:
                        case 84:
                        case 110:
                            {
                            alt34=1;
                            }
                            break;
                    }

                    switch (alt34) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:146:99: p= patternStream
                            {
                            pushFollow(FOLLOW_patternStream_in_patternStream816);
                            p=patternStream();

                            state._fsp--;
                            if (state.failed) return element;

                            if ( state.backtracking==0 ) {element =Pattern.followedBy(element,p);}

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:147:4: patternItem (p= patternStream )?
                    {
                    pushFollow(FOLLOW_patternItem_in_patternStream825);
                    patternItem61=patternItem();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {element =patternItem61;}

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:147:49: (p= patternStream )?
                    int alt35=2;
                    switch ( input.LA(1) ) {
                        case COLLECT:
                        case STREAM:
                        case 73:
                        case 84:
                        case 110:
                            {
                            alt35=1;
                            }
                            break;
                    }

                    switch (alt35) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:147:50: p= patternStream
                            {
                            pushFollow(FOLLOW_patternStream_in_patternStream832);
                            p=patternStream();

                            state._fsp--;
                            if (state.failed) return element;

                            if ( state.backtracking==0 ) {element =Pattern.followedBy(element,p);}

                            }
                            break;

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "patternStream"



    // $ANTLR start "nonEveryPatternStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:150:1: nonEveryPatternStream returns [PatternElement element] : patternItem (p= nonEveryPatternStream )? ;
    public final PatternElement nonEveryPatternStream() throws RecognitionException {
        PatternElement element = null;


        PatternElement p =null;

        PatternElement patternItem62 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:151:2: ( patternItem (p= nonEveryPatternStream )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:151:4: patternItem (p= nonEveryPatternStream )?
            {
            pushFollow(FOLLOW_patternItem_in_nonEveryPatternStream855);
            patternItem62=patternItem();

            state._fsp--;
            if (state.failed) return element;

            if ( state.backtracking==0 ) {element =patternItem62;}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:151:49: (p= nonEveryPatternStream )?
            int alt37=2;
            switch ( input.LA(1) ) {
                case COLLECT:
                case STREAM:
                case 73:
                case 110:
                    {
                    alt37=1;
                    }
                    break;
            }

            switch (alt37) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:151:50: p= nonEveryPatternStream
                    {
                    pushFollow(FOLLOW_nonEveryPatternStream_in_nonEveryPatternStream862);
                    p=nonEveryPatternStream();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {element =Pattern.followedBy(element,p);}

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "nonEveryPatternStream"



    // $ANTLR start "sequenceFullStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:154:1: sequenceFullStream returns [SequenceStream stream] : ^( SEQUENCE sequenceStream ( time )? ) ;
    public final SequenceStream sequenceFullStream() throws RecognitionException {
        SequenceStream stream = null;


        SequenceElement sequenceStream63 =null;

        Expression time64 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:155:2: ( ^( SEQUENCE sequenceStream ( time )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:155:4: ^( SEQUENCE sequenceStream ( time )? )
            {
            match(input,SEQUENCE,FOLLOW_SEQUENCE_in_sequenceFullStream882); if (state.failed) return stream;

            match(input, Token.DOWN, null); if (state.failed) return stream;
            pushFollow(FOLLOW_sequenceStream_in_sequenceFullStream885);
            sequenceStream63=sequenceStream();

            state._fsp--;
            if (state.failed) return stream;

            if ( state.backtracking==0 ) {stream= QueryFactory.sequenceStream(sequenceStream63);}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:155:95: ( time )?
            int alt38=2;
            switch ( input.LA(1) ) {
                case CONSTANT:
                    {
                    alt38=1;
                    }
                    break;
            }

            switch (alt38) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:155:96: time
                    {
                    pushFollow(FOLLOW_time_in_sequenceFullStream890);
                    time64=time();

                    state._fsp--;
                    if (state.failed) return stream;

                    if ( state.backtracking==0 ) {stream= QueryFactory.sequenceStream(sequenceStream63,(Constant)time64);}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return stream;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return stream;
    }
    // $ANTLR end "sequenceFullStream"



    // $ANTLR start "sequenceStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:158:1: sequenceStream returns [SequenceElement element] : ( sequenceItem )+ ;
    public final SequenceElement sequenceStream() throws RecognitionException {
        SequenceElement element = null;


        SequenceElement sequenceItem65 =null;



        		List<SequenceElement> elementList=new ArrayList<SequenceElement>();
        	
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:168:2: ( ( sequenceItem )+ )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:168:5: ( sequenceItem )+
            {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:168:5: ( sequenceItem )+
            int cnt39=0;
            loop39:
            do {
                int alt39=2;
                switch ( input.LA(1) ) {
                case REGEX:
                case STREAM:
                case 110:
                    {
                    alt39=1;
                    }
                    break;

                }

                switch (alt39) {
            	case 1 :
            	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:168:6: sequenceItem
            	    {
            	    pushFollow(FOLLOW_sequenceItem_in_sequenceStream924);
            	    sequenceItem65=sequenceItem();

            	    state._fsp--;
            	    if (state.failed) return element;

            	    if ( state.backtracking==0 ) {elementList.add(sequenceItem65);}

            	    }
            	    break;

            	default :
            	    if ( cnt39 >= 1 ) break loop39;
            	    if (state.backtracking>0) {state.failed=true; return element;}
                        EarlyExitException eee =
                            new EarlyExitException(39, input);
                        throw eee;
                }
                cnt39++;
            } while (true);


            }

            if ( state.backtracking==0 ) {
            		element =elementList.get(elementList.size()-1);
            		for(int i=elementList.size()-2;i>=0;i--){
            			element =Sequence.next(elementList.get(i),element);
            		}
            	}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "sequenceStream"



    // $ANTLR start "patternItem"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:171:1: patternItem returns [PatternElement element] : ( ^( 'and' i1= itemStream i2= itemStream ) | ^( 'or' i1= itemStream i2= itemStream ) | ^( COLLECT itemStream collect ) | itemStream );
    public final PatternElement patternItem() throws RecognitionException {
        PatternElement element = null;


        BasicStream i1 =null;

        BasicStream i2 =null;

        BasicStream itemStream66 =null;

        SiddhiQLGrammarWalker.collect_return collect67 =null;

        BasicStream itemStream68 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:172:2: ( ^( 'and' i1= itemStream i2= itemStream ) | ^( 'or' i1= itemStream i2= itemStream ) | ^( COLLECT itemStream collect ) | itemStream )
            int alt40=4;
            switch ( input.LA(1) ) {
            case 73:
                {
                alt40=1;
                }
                break;
            case 110:
                {
                alt40=2;
                }
                break;
            case COLLECT:
                {
                alt40=3;
                }
                break;
            case STREAM:
                {
                alt40=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }

            switch (alt40) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:172:4: ^( 'and' i1= itemStream i2= itemStream )
                    {
                    match(input,73,FOLLOW_73_in_patternItem946); if (state.failed) return element;

                    match(input, Token.DOWN, null); if (state.failed) return element;
                    pushFollow(FOLLOW_itemStream_in_patternItem950);
                    i1=itemStream();

                    state._fsp--;
                    if (state.failed) return element;

                    pushFollow(FOLLOW_itemStream_in_patternItem954);
                    i2=itemStream();

                    state._fsp--;
                    if (state.failed) return element;

                    match(input, Token.UP, null); if (state.failed) return element;


                    if ( state.backtracking==0 ) {element=Pattern.logical(i1,LogicalElement.Type.AND,i2);}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:173:4: ^( 'or' i1= itemStream i2= itemStream )
                    {
                    match(input,110,FOLLOW_110_in_patternItem964); if (state.failed) return element;

                    match(input, Token.DOWN, null); if (state.failed) return element;
                    pushFollow(FOLLOW_itemStream_in_patternItem969);
                    i1=itemStream();

                    state._fsp--;
                    if (state.failed) return element;

                    pushFollow(FOLLOW_itemStream_in_patternItem973);
                    i2=itemStream();

                    state._fsp--;
                    if (state.failed) return element;

                    match(input, Token.UP, null); if (state.failed) return element;


                    if ( state.backtracking==0 ) {element=Pattern.logical(i1,LogicalElement.Type.OR,i2);}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:174:4: ^( COLLECT itemStream collect )
                    {
                    match(input,COLLECT,FOLLOW_COLLECT_in_patternItem982); if (state.failed) return element;

                    match(input, Token.DOWN, null); if (state.failed) return element;
                    pushFollow(FOLLOW_itemStream_in_patternItem984);
                    itemStream66=itemStream();

                    state._fsp--;
                    if (state.failed) return element;

                    pushFollow(FOLLOW_collect_in_patternItem986);
                    collect67=collect();

                    state._fsp--;
                    if (state.failed) return element;

                    match(input, Token.UP, null); if (state.failed) return element;


                    if ( state.backtracking==0 ) {element=Pattern.count(itemStream66,(collect67!=null?collect67.startVal:0),(collect67!=null?collect67.endVal:0));}

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:175:4: itemStream
                    {
                    pushFollow(FOLLOW_itemStream_in_patternItem995);
                    itemStream68=itemStream();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {element=itemStream68;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "patternItem"



    // $ANTLR start "sequenceItem"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:178:1: sequenceItem returns [SequenceElement element] : ( ^( 'or' i1= itemStream i2= itemStream ) | ^( REGEX itemStream regex[$itemStream.basicStream] ) | itemStream );
    public final SequenceElement sequenceItem() throws RecognitionException {
        SequenceElement element = null;


        BasicStream i1 =null;

        BasicStream i2 =null;

        BasicStream itemStream69 =null;

        SequenceElement regex70 =null;

        BasicStream itemStream71 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:179:2: ( ^( 'or' i1= itemStream i2= itemStream ) | ^( REGEX itemStream regex[$itemStream.basicStream] ) | itemStream )
            int alt41=3;
            switch ( input.LA(1) ) {
            case 110:
                {
                alt41=1;
                }
                break;
            case REGEX:
                {
                alt41=2;
                }
                break;
            case STREAM:
                {
                alt41=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }

            switch (alt41) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:179:4: ^( 'or' i1= itemStream i2= itemStream )
                    {
                    match(input,110,FOLLOW_110_in_sequenceItem1018); if (state.failed) return element;

                    match(input, Token.DOWN, null); if (state.failed) return element;
                    pushFollow(FOLLOW_itemStream_in_sequenceItem1022);
                    i1=itemStream();

                    state._fsp--;
                    if (state.failed) return element;

                    pushFollow(FOLLOW_itemStream_in_sequenceItem1026);
                    i2=itemStream();

                    state._fsp--;
                    if (state.failed) return element;

                    match(input, Token.UP, null); if (state.failed) return element;


                    if ( state.backtracking==0 ) {element=Sequence.or(i1,i2);}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:180:4: ^( REGEX itemStream regex[$itemStream.basicStream] )
                    {
                    match(input,REGEX,FOLLOW_REGEX_in_sequenceItem1040); if (state.failed) return element;

                    match(input, Token.DOWN, null); if (state.failed) return element;
                    pushFollow(FOLLOW_itemStream_in_sequenceItem1042);
                    itemStream69=itemStream();

                    state._fsp--;
                    if (state.failed) return element;

                    pushFollow(FOLLOW_regex_in_sequenceItem1044);
                    regex70=regex(itemStream69);

                    state._fsp--;
                    if (state.failed) return element;

                    match(input, Token.UP, null); if (state.failed) return element;


                    if ( state.backtracking==0 ) {element=regex70;}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:181:4: itemStream
                    {
                    pushFollow(FOLLOW_itemStream_in_sequenceItem1055);
                    itemStream71=itemStream();

                    state._fsp--;
                    if (state.failed) return element;

                    if ( state.backtracking==0 ) {element=itemStream71;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "sequenceItem"



    // $ANTLR start "itemStream"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:184:1: itemStream returns [BasicStream basicStream] : ^( STREAM rawStream ( attributeName )? ) ;
    public final BasicStream itemStream() throws RecognitionException {
        BasicStream basicStream = null;


        BasicStream rawStream72 =null;

        String attributeName73 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:185:2: ( ^( STREAM rawStream ( attributeName )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:185:4: ^( STREAM rawStream ( attributeName )? )
            {
            match(input,STREAM,FOLLOW_STREAM_in_itemStream1086); if (state.failed) return basicStream;

            match(input, Token.DOWN, null); if (state.failed) return basicStream;
            pushFollow(FOLLOW_rawStream_in_itemStream1088);
            rawStream72=rawStream();

            state._fsp--;
            if (state.failed) return basicStream;

            if ( state.backtracking==0 ) {basicStream =rawStream72;}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:185:59: ( attributeName )?
            int alt42=2;
            switch ( input.LA(1) ) {
                case ATTRIBUTE:
                    {
                    alt42=1;
                    }
                    break;
            }

            switch (alt42) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:185:60: attributeName
                    {
                    pushFollow(FOLLOW_attributeName_in_itemStream1092);
                    attributeName73=attributeName();

                    state._fsp--;
                    if (state.failed) return basicStream;

                    if ( state.backtracking==0 ) {basicStream.setStreamReferenceId(attributeName73);}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return basicStream;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return basicStream;
    }
    // $ANTLR end "itemStream"



    // $ANTLR start "regex"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:189:1: regex[BasicStream basicStream] returns [SequenceElement element] : ( '*' | '+' | '?' ) ( '?' )? ;
    public final SequenceElement regex(BasicStream basicStream) throws RecognitionException {
        SequenceElement element = null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:190:2: ( ( '*' | '+' | '?' ) ( '?' )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:190:4: ( '*' | '+' | '?' ) ( '?' )?
            {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:190:4: ( '*' | '+' | '?' )
            int alt43=3;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt43=1;
                }
                break;
            case 55:
                {
                alt43=2;
                }
                break;
            case 68:
                {
                alt43=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return element;}
                NoViableAltException nvae =
                    new NoViableAltException("", 43, 0, input);

                throw nvae;

            }

            switch (alt43) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:190:5: '*'
                    {
                    match(input,54,FOLLOW_54_in_regex1118); if (state.failed) return element;

                    if ( state.backtracking==0 ) {element =Sequence.zeroOrMany(basicStream);}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:190:56: '+'
                    {
                    match(input,55,FOLLOW_55_in_regex1123); if (state.failed) return element;

                    if ( state.backtracking==0 ) {element =Sequence.oneOrMany(basicStream);}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:190:105: '?'
                    {
                    match(input,68,FOLLOW_68_in_regex1127); if (state.failed) return element;

                    if ( state.backtracking==0 ) {element =Sequence.zeroOrOne(basicStream);}

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:190:155: ( '?' )?
            int alt44=2;
            switch ( input.LA(1) ) {
                case 68:
                    {
                    alt44=1;
                    }
                    break;
            }

            switch (alt44) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:190:156: '?'
                    {
                    match(input,68,FOLLOW_68_in_regex1133); if (state.failed) return element;

                    if ( state.backtracking==0 ) {System.err.println(" ? variation in regex not yet supported!");}

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return element;
    }
    // $ANTLR end "regex"



    // $ANTLR start "outputProjection"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:193:1: outputProjection returns [Projector projector] : ( externalCall )? ^( OUT_ATTRIBUTES outputAttributeList ) ( groupBy )? ( having )? ;
    public final Projector outputProjection() throws RecognitionException {
        Projector projector = null;


        List<OutputAttribute> outputAttributeList74 =null;

        List<Variable> groupBy75 =null;

        Condition having76 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:194:2: ( ( externalCall )? ^( OUT_ATTRIBUTES outputAttributeList ) ( groupBy )? ( having )? )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:194:4: ( externalCall )? ^( OUT_ATTRIBUTES outputAttributeList ) ( groupBy )? ( having )?
            {
            if ( state.backtracking==0 ) {projector = QueryFactory.outputProjector();}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:195:3: ( externalCall )?
            int alt45=2;
            switch ( input.LA(1) ) {
                case 77:
                    {
                    alt45=1;
                    }
                    break;
            }

            switch (alt45) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:195:3: externalCall
                    {
                    pushFollow(FOLLOW_externalCall_in_outputProjection1157);
                    externalCall();

                    state._fsp--;
                    if (state.failed) return projector;

                    }
                    break;

            }


            match(input,OUT_ATTRIBUTES,FOLLOW_OUT_ATTRIBUTES_in_outputProjection1164); if (state.failed) return projector;

            match(input, Token.DOWN, null); if (state.failed) return projector;
            pushFollow(FOLLOW_outputAttributeList_in_outputProjection1166);
            outputAttributeList74=outputAttributeList();

            state._fsp--;
            if (state.failed) return projector;

            if ( state.backtracking==0 ) {projector.addProjectionList(outputAttributeList74);}

            match(input, Token.UP, null); if (state.failed) return projector;


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:197:3: ( groupBy )?
            int alt46=2;
            switch ( input.LA(1) ) {
                case 89:
                    {
                    alt46=1;
                    }
                    break;
            }

            switch (alt46) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:197:4: groupBy
                    {
                    pushFollow(FOLLOW_groupBy_in_outputProjection1176);
                    groupBy75=groupBy();

                    state._fsp--;
                    if (state.failed) return projector;

                    if ( state.backtracking==0 ) {projector.addGroupByList(groupBy75);}

                    }
                    break;

            }


            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:198:3: ( having )?
            int alt47=2;
            switch ( input.LA(1) ) {
                case 90:
                    {
                    alt47=1;
                    }
                    break;
            }

            switch (alt47) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:198:4: having
                    {
                    pushFollow(FOLLOW_having_in_outputProjection1185);
                    having76=having();

                    state._fsp--;
                    if (state.failed) return projector;

                    if ( state.backtracking==0 ) {projector.having(having76);}

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return projector;
    }
    // $ANTLR end "outputProjection"



    // $ANTLR start "outputAttributeList"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:201:1: outputAttributeList returns [List<OutputAttribute> attributeList] : ( '*' | ( ^( OUT_ATTRIBUTE outputItem ) )+ );
    public final List<OutputAttribute> outputAttributeList() throws RecognitionException {
        List<OutputAttribute> attributeList = null;


        OutputAttribute outputItem77 =null;



        		attributeList =new ArrayList<OutputAttribute>();
        	
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:205:2: ( '*' | ( ^( OUT_ATTRIBUTE outputItem ) )+ )
            int alt49=2;
            switch ( input.LA(1) ) {
            case 54:
                {
                alt49=1;
                }
                break;
            case OUT_ATTRIBUTE:
                {
                alt49=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return attributeList;}
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;

            }

            switch (alt49) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:205:4: '*'
                    {
                    match(input,54,FOLLOW_54_in_outputAttributeList1211); if (state.failed) return attributeList;

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:206:4: ( ^( OUT_ATTRIBUTE outputItem ) )+
                    {
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:206:4: ( ^( OUT_ATTRIBUTE outputItem ) )+
                    int cnt48=0;
                    loop48:
                    do {
                        int alt48=2;
                        switch ( input.LA(1) ) {
                        case OUT_ATTRIBUTE:
                            {
                            alt48=1;
                            }
                            break;

                        }

                        switch (alt48) {
                    	case 1 :
                    	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:206:6: ^( OUT_ATTRIBUTE outputItem )
                    	    {
                    	    match(input,OUT_ATTRIBUTE,FOLLOW_OUT_ATTRIBUTE_in_outputAttributeList1220); if (state.failed) return attributeList;

                    	    match(input, Token.DOWN, null); if (state.failed) return attributeList;
                    	    pushFollow(FOLLOW_outputItem_in_outputAttributeList1222);
                    	    outputItem77=outputItem();

                    	    state._fsp--;
                    	    if (state.failed) return attributeList;

                    	    if ( state.backtracking==0 ) {attributeList.add(outputItem77);}

                    	    match(input, Token.UP, null); if (state.failed) return attributeList;


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt48 >= 1 ) break loop48;
                    	    if (state.backtracking>0) {state.failed=true; return attributeList;}
                                EarlyExitException eee =
                                    new EarlyExitException(48, input);
                                throw eee;
                        }
                        cnt48++;
                    } while (true);


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return attributeList;
    }
    // $ANTLR end "outputAttributeList"



    // $ANTLR start "outputItem"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:209:1: outputItem returns [OutputAttribute value] : ( id extensionOutFunction[$id.value] | outFunction id |ex= expression id | attributeVariable );
    public final OutputAttribute outputItem() throws RecognitionException {
        OutputAttribute value = null;


        Expression ex =null;

        String id78 =null;

        OutputAttributeExtension extensionOutFunction79 =null;

        String id80 =null;

        SiddhiQLGrammarWalker.outFunction_return outFunction81 =null;

        String id82 =null;

        Variable attributeVariable83 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:210:2: ( id extensionOutFunction[$id.value] | outFunction id |ex= expression id | attributeVariable )
            int alt50=4;
            switch ( input.LA(1) ) {
            case ID:
            case ID_QUOTES:
                {
                alt50=1;
                }
                break;
            case FUNCTION:
                {
                alt50=2;
                }
                break;
            case CONSTANT:
            case EXTENSION_FUNCTION:
            case 51:
            case 54:
            case 55:
            case 57:
            case 59:
            case 75:
            case 83:
            case 86:
            case 96:
            case 100:
            case 118:
                {
                alt50=3;
                }
                break;
            case ATTRIBUTE:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case ID:
                        {
                        switch ( input.LA(4) ) {
                        case DOWN:
                            {
                            switch ( input.LA(5) ) {
                            case POSITIVE_INT_VAL:
                                {
                                switch ( input.LA(6) ) {
                                case UP:
                                    {
                                    switch ( input.LA(7) ) {
                                    case ID:
                                        {
                                        switch ( input.LA(8) ) {
                                        case UP:
                                            {
                                            switch ( input.LA(9) ) {
                                            case ID:
                                            case ID_QUOTES:
                                                {
                                                alt50=3;
                                                }
                                                break;
                                            case UP:
                                                {
                                                alt50=4;
                                                }
                                                break;
                                            default:
                                                if (state.backtracking>0) {state.failed=true; return value;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 50, 18, input);

                                                throw nvae;

                                            }

                                            }
                                            break;
                                        default:
                                            if (state.backtracking>0) {state.failed=true; return value;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 50, 16, input);

                                            throw nvae;

                                        }

                                        }
                                        break;
                                    case ID_QUOTES:
                                        {
                                        switch ( input.LA(8) ) {
                                        case UP:
                                            {
                                            switch ( input.LA(9) ) {
                                            case ID:
                                            case ID_QUOTES:
                                                {
                                                alt50=3;
                                                }
                                                break;
                                            case UP:
                                                {
                                                alt50=4;
                                                }
                                                break;
                                            default:
                                                if (state.backtracking>0) {state.failed=true; return value;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 50, 18, input);

                                                throw nvae;

                                            }

                                            }
                                            break;
                                        default:
                                            if (state.backtracking>0) {state.failed=true; return value;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 50, 17, input);

                                            throw nvae;

                                        }

                                        }
                                        break;
                                    default:
                                        if (state.backtracking>0) {state.failed=true; return value;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 50, 15, input);

                                        throw nvae;

                                    }

                                    }
                                    break;
                                default:
                                    if (state.backtracking>0) {state.failed=true; return value;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 50, 12, input);

                                    throw nvae;

                                }

                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return value;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 50, 8, input);

                                throw nvae;

                            }

                            }
                            break;
                        case ID:
                            {
                            switch ( input.LA(5) ) {
                            case UP:
                                {
                                switch ( input.LA(6) ) {
                                case ID:
                                case ID_QUOTES:
                                    {
                                    alt50=3;
                                    }
                                    break;
                                case UP:
                                    {
                                    alt50=4;
                                    }
                                    break;
                                default:
                                    if (state.backtracking>0) {state.failed=true; return value;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 50, 13, input);

                                    throw nvae;

                                }

                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return value;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 50, 9, input);

                                throw nvae;

                            }

                            }
                            break;
                        case ID_QUOTES:
                            {
                            switch ( input.LA(5) ) {
                            case UP:
                                {
                                switch ( input.LA(6) ) {
                                case ID:
                                case ID_QUOTES:
                                    {
                                    alt50=3;
                                    }
                                    break;
                                case UP:
                                    {
                                    alt50=4;
                                    }
                                    break;
                                default:
                                    if (state.backtracking>0) {state.failed=true; return value;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 50, 13, input);

                                    throw nvae;

                                }

                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return value;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 50, 10, input);

                                throw nvae;

                            }

                            }
                            break;
                        case UP:
                            {
                            switch ( input.LA(5) ) {
                            case ID:
                            case ID_QUOTES:
                                {
                                alt50=3;
                                }
                                break;
                            case UP:
                                {
                                alt50=4;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return value;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 50, 11, input);

                                throw nvae;

                            }

                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 50, 6, input);

                            throw nvae;

                        }

                        }
                        break;
                    case ID_QUOTES:
                        {
                        switch ( input.LA(4) ) {
                        case DOWN:
                            {
                            switch ( input.LA(5) ) {
                            case POSITIVE_INT_VAL:
                                {
                                switch ( input.LA(6) ) {
                                case UP:
                                    {
                                    switch ( input.LA(7) ) {
                                    case ID:
                                        {
                                        switch ( input.LA(8) ) {
                                        case UP:
                                            {
                                            switch ( input.LA(9) ) {
                                            case ID:
                                            case ID_QUOTES:
                                                {
                                                alt50=3;
                                                }
                                                break;
                                            case UP:
                                                {
                                                alt50=4;
                                                }
                                                break;
                                            default:
                                                if (state.backtracking>0) {state.failed=true; return value;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 50, 18, input);

                                                throw nvae;

                                            }

                                            }
                                            break;
                                        default:
                                            if (state.backtracking>0) {state.failed=true; return value;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 50, 16, input);

                                            throw nvae;

                                        }

                                        }
                                        break;
                                    case ID_QUOTES:
                                        {
                                        switch ( input.LA(8) ) {
                                        case UP:
                                            {
                                            switch ( input.LA(9) ) {
                                            case ID:
                                            case ID_QUOTES:
                                                {
                                                alt50=3;
                                                }
                                                break;
                                            case UP:
                                                {
                                                alt50=4;
                                                }
                                                break;
                                            default:
                                                if (state.backtracking>0) {state.failed=true; return value;}
                                                NoViableAltException nvae =
                                                    new NoViableAltException("", 50, 18, input);

                                                throw nvae;

                                            }

                                            }
                                            break;
                                        default:
                                            if (state.backtracking>0) {state.failed=true; return value;}
                                            NoViableAltException nvae =
                                                new NoViableAltException("", 50, 17, input);

                                            throw nvae;

                                        }

                                        }
                                        break;
                                    default:
                                        if (state.backtracking>0) {state.failed=true; return value;}
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 50, 15, input);

                                        throw nvae;

                                    }

                                    }
                                    break;
                                default:
                                    if (state.backtracking>0) {state.failed=true; return value;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 50, 12, input);

                                    throw nvae;

                                }

                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return value;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 50, 8, input);

                                throw nvae;

                            }

                            }
                            break;
                        case ID:
                            {
                            switch ( input.LA(5) ) {
                            case UP:
                                {
                                switch ( input.LA(6) ) {
                                case ID:
                                case ID_QUOTES:
                                    {
                                    alt50=3;
                                    }
                                    break;
                                case UP:
                                    {
                                    alt50=4;
                                    }
                                    break;
                                default:
                                    if (state.backtracking>0) {state.failed=true; return value;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 50, 13, input);

                                    throw nvae;

                                }

                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return value;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 50, 9, input);

                                throw nvae;

                            }

                            }
                            break;
                        case ID_QUOTES:
                            {
                            switch ( input.LA(5) ) {
                            case UP:
                                {
                                switch ( input.LA(6) ) {
                                case ID:
                                case ID_QUOTES:
                                    {
                                    alt50=3;
                                    }
                                    break;
                                case UP:
                                    {
                                    alt50=4;
                                    }
                                    break;
                                default:
                                    if (state.backtracking>0) {state.failed=true; return value;}
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 50, 13, input);

                                    throw nvae;

                                }

                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return value;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 50, 10, input);

                                throw nvae;

                            }

                            }
                            break;
                        case UP:
                            {
                            switch ( input.LA(5) ) {
                            case ID:
                            case ID_QUOTES:
                                {
                                alt50=3;
                                }
                                break;
                            case UP:
                                {
                                alt50=4;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return value;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 50, 11, input);

                                throw nvae;

                            }

                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return value;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 50, 7, input);

                            throw nvae;

                        }

                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return value;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 50, 5, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return value;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 50, 4, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;

            }

            switch (alt50) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:210:4: id extensionOutFunction[$id.value]
                    {
                    pushFollow(FOLLOW_id_in_outputItem1243);
                    id78=id();

                    state._fsp--;
                    if (state.failed) return value;

                    pushFollow(FOLLOW_extensionOutFunction_in_outputItem1245);
                    extensionOutFunction79=extensionOutFunction(id78);

                    state._fsp--;
                    if (state.failed) return value;

                    if ( state.backtracking==0 ) {value =extensionOutFunction79;}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:211:7: outFunction id
                    {
                    pushFollow(FOLLOW_outFunction_in_outputItem1256);
                    outFunction81=outFunction();

                    state._fsp--;
                    if (state.failed) return value;

                    pushFollow(FOLLOW_id_in_outputItem1258);
                    id80=id();

                    state._fsp--;
                    if (state.failed) return value;

                    if ( state.backtracking==0 ) {value =new ComplexAttribute(id80, (outFunction81!=null?outFunction81.name:null), (outFunction81!=null?outFunction81.expressions:null));}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:212:4: ex= expression id
                    {
                    pushFollow(FOLLOW_expression_in_outputItem1269);
                    ex=expression();

                    state._fsp--;
                    if (state.failed) return value;

                    pushFollow(FOLLOW_id_in_outputItem1271);
                    id82=id();

                    state._fsp--;
                    if (state.failed) return value;

                    if ( state.backtracking==0 ) {value =new SimpleAttribute(id82, ex);}

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:213:4: attributeVariable
                    {
                    pushFollow(FOLLOW_attributeVariable_in_outputItem1283);
                    attributeVariable83=attributeVariable();

                    state._fsp--;
                    if (state.failed) return value;

                    if ( state.backtracking==0 ) {value =new SimpleAttribute(attributeVariable83.getAttributeName(), attributeVariable83);}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "outputItem"



    // $ANTLR start "extensionOutFunction"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:216:1: extensionOutFunction[String id] returns [OutputAttributeExtension value] : ^( EXTENSION_FUNCTION extensionId functionId ( parameters )? ) ;
    public final OutputAttributeExtension extensionOutFunction(String id) throws RecognitionException {
        OutputAttributeExtension value = null;


        String extensionId84 =null;

        String functionId85 =null;

        Expression[] parameters86 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:217:5: ( ^( EXTENSION_FUNCTION extensionId functionId ( parameters )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:217:7: ^( EXTENSION_FUNCTION extensionId functionId ( parameters )? )
            {
            match(input,EXTENSION_FUNCTION,FOLLOW_EXTENSION_FUNCTION_in_extensionOutFunction1307); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_extensionId_in_extensionOutFunction1309);
            extensionId84=extensionId();

            state._fsp--;
            if (state.failed) return value;

            pushFollow(FOLLOW_functionId_in_extensionOutFunction1311);
            functionId85=functionId();

            state._fsp--;
            if (state.failed) return value;

            if ( state.backtracking==0 ) {value =new OutputAttributeExtension(id, extensionId84, functionId85,null);}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:218:29: ( parameters )?
            int alt51=2;
            switch ( input.LA(1) ) {
                case PARAMETERS:
                    {
                    alt51=1;
                    }
                    break;
            }

            switch (alt51) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:218:30: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_extensionOutFunction1344);
                    parameters86=parameters();

                    state._fsp--;
                    if (state.failed) return value;

                    if ( state.backtracking==0 ) {value = new OutputAttributeExtension(id, extensionId84, functionId85, parameters86);}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return value;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "extensionOutFunction"


    public static class outFunction_return extends TreeRuleReturnScope {
        public String name;
        public Expression[] expressions;
    };


    // $ANTLR start "outFunction"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:222:1: outFunction returns [String name, Expression[] expressions] : ^( FUNCTION ID ( parameters )? ) ;
    public final SiddhiQLGrammarWalker.outFunction_return outFunction() throws RecognitionException {
        SiddhiQLGrammarWalker.outFunction_return retval = new SiddhiQLGrammarWalker.outFunction_return();
        retval.start = input.LT(1);


        CommonTree ID87=null;
        Expression[] parameters88 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:223:2: ( ^( FUNCTION ID ( parameters )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:223:5: ^( FUNCTION ID ( parameters )? )
            {
            match(input,FUNCTION,FOLLOW_FUNCTION_in_outFunction1373); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            ID87=(CommonTree)match(input,ID,FOLLOW_ID_in_outFunction1375); if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.name =(ID87!=null?ID87.getText():null);}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:223:38: ( parameters )?
            int alt52=2;
            switch ( input.LA(1) ) {
                case PARAMETERS:
                    {
                    alt52=1;
                    }
                    break;
            }

            switch (alt52) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:223:39: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_outFunction1380);
                    parameters88=parameters();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.expressions =parameters88;}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return retval;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "outFunction"



    // $ANTLR start "groupBy"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:226:1: groupBy returns [List<Variable> variables] : ^( 'group' ( attributeVariable )+ ) ;
    public final List<Variable> groupBy() throws RecognitionException {
        List<Variable> variables = null;


        Variable attributeVariable89 =null;



        		variables =new ArrayList<Variable>();
        	
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:230:2: ( ^( 'group' ( attributeVariable )+ ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:230:4: ^( 'group' ( attributeVariable )+ )
            {
            match(input,89,FOLLOW_89_in_groupBy1408); if (state.failed) return variables;

            match(input, Token.DOWN, null); if (state.failed) return variables;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:230:14: ( attributeVariable )+
            int cnt53=0;
            loop53:
            do {
                int alt53=2;
                switch ( input.LA(1) ) {
                case ATTRIBUTE:
                    {
                    alt53=1;
                    }
                    break;

                }

                switch (alt53) {
            	case 1 :
            	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:230:15: attributeVariable
            	    {
            	    pushFollow(FOLLOW_attributeVariable_in_groupBy1411);
            	    attributeVariable89=attributeVariable();

            	    state._fsp--;
            	    if (state.failed) return variables;

            	    if ( state.backtracking==0 ) {variables.add(attributeVariable89);}

            	    }
            	    break;

            	default :
            	    if ( cnt53 >= 1 ) break loop53;
            	    if (state.backtracking>0) {state.failed=true; return variables;}
                        EarlyExitException eee =
                            new EarlyExitException(53, input);
                        throw eee;
                }
                cnt53++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return variables;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return variables;
    }
    // $ANTLR end "groupBy"



    // $ANTLR start "having"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:233:1: having returns [Condition value] : ^( 'having' condition ) ;
    public final Condition having() throws RecognitionException {
        Condition value = null;


        Condition condition90 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:234:2: ( ^( 'having' condition ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:234:4: ^( 'having' condition )
            {
            match(input,90,FOLLOW_90_in_having1432); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_condition_in_having1434);
            condition90=condition();

            state._fsp--;
            if (state.failed) return value;

            match(input, Token.UP, null); if (state.failed) return value;


            if ( state.backtracking==0 ) {value =condition90;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "having"



    // $ANTLR start "externalCall"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:237:1: externalCall : ^( 'call' ^( ID ( parameters )? ) ) ;
    public final void externalCall() throws RecognitionException {
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:238:2: ( ^( 'call' ^( ID ( parameters )? ) ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:238:4: ^( 'call' ^( ID ( parameters )? ) )
            {
            match(input,77,FOLLOW_77_in_externalCall1450); if (state.failed) return ;

            match(input, Token.DOWN, null); if (state.failed) return ;
            match(input,ID,FOLLOW_ID_in_externalCall1453); if (state.failed) return ;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return ;
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:238:19: ( parameters )?
                int alt54=2;
                switch ( input.LA(1) ) {
                    case PARAMETERS:
                        {
                        alt54=1;
                        }
                        break;
                }

                switch (alt54) {
                    case 1 :
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:238:19: parameters
                        {
                        pushFollow(FOLLOW_parameters_in_externalCall1455);
                        parameters();

                        state._fsp--;
                        if (state.failed) return ;

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return ;
            }


            match(input, Token.UP, null); if (state.failed) return ;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "externalCall"



    // $ANTLR start "filterHandler"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:241:1: filterHandler returns [Filter filter] : ^( FILTER condition ) ;
    public final Filter filterHandler() throws RecognitionException {
        Filter filter = null;


        Condition condition91 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:242:2: ( ^( FILTER condition ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:242:4: ^( FILTER condition )
            {
            match(input,FILTER,FOLLOW_FILTER_in_filterHandler1475); if (state.failed) return filter;

            match(input, Token.DOWN, null); if (state.failed) return filter;
            pushFollow(FOLLOW_condition_in_filterHandler1477);
            condition91=condition();

            state._fsp--;
            if (state.failed) return filter;

            if ( state.backtracking==0 ) {filter =new Filter(condition91);}

            match(input, Token.UP, null); if (state.failed) return filter;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return filter;
    }
    // $ANTLR end "filterHandler"



    // $ANTLR start "transformHandler"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:245:1: transformHandler returns [Transformer transformer] : ^( TRANSFORM extensibleId[\"transform\"] ( parameters )? ) ;
    public final Transformer transformHandler() throws RecognitionException {
        Transformer transformer = null;


        SiddhiQLGrammarWalker.extensibleId_return extensibleId92 =null;

        Expression[] parameters93 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:246:2: ( ^( TRANSFORM extensibleId[\"transform\"] ( parameters )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:246:4: ^( TRANSFORM extensibleId[\"transform\"] ( parameters )? )
            {
            match(input,TRANSFORM,FOLLOW_TRANSFORM_in_transformHandler1498); if (state.failed) return transformer;

            match(input, Token.DOWN, null); if (state.failed) return transformer;
            pushFollow(FOLLOW_extensibleId_in_transformHandler1500);
            extensibleId92=extensibleId("transform");

            state._fsp--;
            if (state.failed) return transformer;

            if ( state.backtracking==0 ) {transformer =new Transformer((extensibleId92!=null?extensibleId92.name:null),(TransformExtension) (extensibleId92!=null?extensibleId92.extension:null), null);}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:246:146: ( parameters )?
            int alt55=2;
            switch ( input.LA(1) ) {
                case PARAMETERS:
                    {
                    alt55=1;
                    }
                    break;
            }

            switch (alt55) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:246:147: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_transformHandler1506);
                    parameters93=parameters();

                    state._fsp--;
                    if (state.failed) return transformer;

                    if ( state.backtracking==0 ) {transformer =new Transformer((extensibleId92!=null?extensibleId92.name:null), (TransformExtension)(extensibleId92!=null?extensibleId92.extension:null), parameters93);}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return transformer;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return transformer;
    }
    // $ANTLR end "transformHandler"



    // $ANTLR start "windowHandler"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:249:1: windowHandler returns [Window window] : ^( WINDOW extensibleId[\"window\"] ( parameters )? ) ;
    public final Window windowHandler() throws RecognitionException {
        Window window = null;


        SiddhiQLGrammarWalker.extensibleId_return extensibleId94 =null;

        Expression[] parameters95 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:250:2: ( ^( WINDOW extensibleId[\"window\"] ( parameters )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:250:4: ^( WINDOW extensibleId[\"window\"] ( parameters )? )
            {
            match(input,WINDOW,FOLLOW_WINDOW_in_windowHandler1528); if (state.failed) return window;

            match(input, Token.DOWN, null); if (state.failed) return window;
            pushFollow(FOLLOW_extensibleId_in_windowHandler1530);
            extensibleId94=extensibleId("window");

            state._fsp--;
            if (state.failed) return window;

            if ( state.backtracking==0 ) {window =new Window((extensibleId94!=null?extensibleId94.name:null),(WindowExtension) (extensibleId94!=null?extensibleId94.extension:null), null);}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:250:126: ( parameters )?
            int alt56=2;
            switch ( input.LA(1) ) {
                case PARAMETERS:
                    {
                    alt56=1;
                    }
                    break;
            }

            switch (alt56) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:250:127: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_windowHandler1536);
                    parameters95=parameters();

                    state._fsp--;
                    if (state.failed) return window;

                    if ( state.backtracking==0 ) {window =new Window((extensibleId94!=null?extensibleId94.name:null), (WindowExtension)(extensibleId94!=null?extensibleId94.extension:null), parameters95);}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return window;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return window;
    }
    // $ANTLR end "windowHandler"


    public static class extensibleId_return extends TreeRuleReturnScope {
        public String name;
        public Extension extension;
    };


    // $ANTLR start "extensibleId"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:253:1: extensibleId[String type] returns [String name, Extension extension] : ( id | ^( EXTENSION extensionId functionId ) );
    public final SiddhiQLGrammarWalker.extensibleId_return extensibleId(String type) throws RecognitionException {
        SiddhiQLGrammarWalker.extensibleId_return retval = new SiddhiQLGrammarWalker.extensibleId_return();
        retval.start = input.LT(1);


        String id96 =null;

        String extensionId97 =null;

        String functionId98 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:254:5: ( id | ^( EXTENSION extensionId functionId ) )
            int alt57=2;
            switch ( input.LA(1) ) {
            case ID:
            case ID_QUOTES:
                {
                alt57=1;
                }
                break;
            case EXTENSION:
                {
                alt57=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 57, 0, input);

                throw nvae;

            }

            switch (alt57) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:254:7: id
                    {
                    pushFollow(FOLLOW_id_in_extensibleId1561);
                    id96=id();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.name =id96;}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:255:7: ^( EXTENSION extensionId functionId )
                    {
                    match(input,EXTENSION,FOLLOW_EXTENSION_in_extensibleId1573); if (state.failed) return retval;

                    match(input, Token.DOWN, null); if (state.failed) return retval;
                    pushFollow(FOLLOW_extensionId_in_extensibleId1577);
                    extensionId97=extensionId();

                    state._fsp--;
                    if (state.failed) return retval;

                    pushFollow(FOLLOW_functionId_in_extensibleId1579);
                    functionId98=functionId();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {
                            if("window".equals(type)){
                                retval.extension =new WindowExtension(extensionId97, functionId98);
                            } else if("transform".equals(type)){
                                retval.extension =new TransformExtension(extensionId97, functionId98);
                            } else {
                                System.err.println("Extension for "+type+" is not supported!");
                            }
                        }

                    match(input, Token.UP, null); if (state.failed) return retval;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "extensibleId"


    protected static class parameters_scope {
        List<Expression> parameterlist;
    }
    protected Stack parameters_stack = new Stack();



    // $ANTLR start "parameters"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:266:1: parameters returns [Expression[] expressions] : ^( PARAMETERS ( parameter )+ ) ;
    public final Expression[] parameters() throws RecognitionException {
        parameters_stack.push(new parameters_scope());
        Expression[] expressions = null;


        Expression parameter99 =null;



        		((parameters_scope)parameters_stack.peek()).parameterlist =new ArrayList<Expression>();
        	
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:276:2: ( ^( PARAMETERS ( parameter )+ ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:276:5: ^( PARAMETERS ( parameter )+ )
            {
            match(input,PARAMETERS,FOLLOW_PARAMETERS_in_parameters1617); if (state.failed) return expressions;

            match(input, Token.DOWN, null); if (state.failed) return expressions;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:276:18: ( parameter )+
            int cnt58=0;
            loop58:
            do {
                int alt58=2;
                switch ( input.LA(1) ) {
                case ATTRIBUTE:
                case CONSTANT:
                case EXTENSION_FUNCTION:
                case 51:
                case 54:
                case 55:
                case 57:
                case 59:
                case 75:
                case 83:
                case 86:
                case 96:
                case 100:
                case 118:
                    {
                    alt58=1;
                    }
                    break;

                }

                switch (alt58) {
            	case 1 :
            	    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:276:19: parameter
            	    {
            	    pushFollow(FOLLOW_parameter_in_parameters1620);
            	    parameter99=parameter();

            	    state._fsp--;
            	    if (state.failed) return expressions;

            	    if ( state.backtracking==0 ) {((parameters_scope)parameters_stack.peek()).parameterlist.add(parameter99);}

            	    }
            	    break;

            	default :
            	    if ( cnt58 >= 1 ) break loop58;
            	    if (state.backtracking>0) {state.failed=true; return expressions;}
                        EarlyExitException eee =
                            new EarlyExitException(58, input);
                        throw eee;
                }
                cnt58++;
            } while (true);


            match(input, Token.UP, null); if (state.failed) return expressions;


            }

            if ( state.backtracking==0 ) {
            		expressions =((parameters_scope)parameters_stack.peek()).parameterlist.toArray(new Expression[((parameters_scope)parameters_stack.peek()).parameterlist.size()]);
            	}
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            parameters_stack.pop();
        }
        return expressions;
    }
    // $ANTLR end "parameters"



    // $ANTLR start "time"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:279:1: time returns [Expression expression] : constant ;
    public final Expression time() throws RecognitionException {
        Expression expression = null;


        Expression constant100 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:280:2: ( constant )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:280:4: constant
            {
            pushFollow(FOLLOW_constant_in_time1640);
            constant100=constant();

            state._fsp--;
            if (state.failed) return expression;

            if ( state.backtracking==0 ) {expression =constant100;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expression;
    }
    // $ANTLR end "time"



    // $ANTLR start "parameter"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:283:1: parameter returns [Expression expression] : e1= expression ;
    public final Expression parameter() throws RecognitionException {
        Expression expression = null;


        Expression e1 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:284:2: (e1= expression )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:284:4: e1= expression
            {
            pushFollow(FOLLOW_expression_in_parameter1660);
            e1=expression();

            state._fsp--;
            if (state.failed) return expression;

            if ( state.backtracking==0 ) {expression =e1;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expression;
    }
    // $ANTLR end "parameter"


    public static class collect_return extends TreeRuleReturnScope {
        public int startVal;
        public int endVal;
    };


    // $ANTLR start "collect"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:287:1: collect returns [int startVal , int endVal] : ( countStart ':' countEnd | countStart ':' | ':' countEnd | countStartAndEnd );
    public final SiddhiQLGrammarWalker.collect_return collect() throws RecognitionException {
        SiddhiQLGrammarWalker.collect_return retval = new SiddhiQLGrammarWalker.collect_return();
        retval.start = input.LT(1);


        int countStart101 =0;

        int countEnd102 =0;

        int countStart103 =0;

        int countEnd104 =0;

        int countStartAndEnd105 =0;



        		retval.startVal =0;
        		retval.endVal =-2;//UNLIMITED
        	
        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:292:2: ( countStart ':' countEnd | countStart ':' | ':' countEnd | countStartAndEnd )
            int alt59=4;
            switch ( input.LA(1) ) {
            case POSITIVE_INT_VAL:
                {
                switch ( input.LA(2) ) {
                case 60:
                    {
                    switch ( input.LA(3) ) {
                    case POSITIVE_INT_VAL:
                        {
                        alt59=1;
                        }
                        break;
                    case UP:
                        {
                        alt59=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 59, 3, input);

                        throw nvae;

                    }

                    }
                    break;
                case UP:
                    {
                    alt59=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 59, 1, input);

                    throw nvae;

                }

                }
                break;
            case 60:
                {
                alt59=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;

            }

            switch (alt59) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:292:4: countStart ':' countEnd
                    {
                    pushFollow(FOLLOW_countStart_in_collect1682);
                    countStart101=countStart();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,60,FOLLOW_60_in_collect1684); if (state.failed) return retval;

                    pushFollow(FOLLOW_countEnd_in_collect1686);
                    countEnd102=countEnd();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.startVal =countStart101; retval.endVal =countEnd102;}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:293:4: countStart ':'
                    {
                    pushFollow(FOLLOW_countStart_in_collect1694);
                    countStart103=countStart();

                    state._fsp--;
                    if (state.failed) return retval;

                    match(input,60,FOLLOW_60_in_collect1696); if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.startVal =countStart103;}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:294:4: ':' countEnd
                    {
                    match(input,60,FOLLOW_60_in_collect1705); if (state.failed) return retval;

                    pushFollow(FOLLOW_countEnd_in_collect1707);
                    countEnd104=countEnd();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.endVal =countEnd104;}

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:295:4: countStartAndEnd
                    {
                    pushFollow(FOLLOW_countStartAndEnd_in_collect1718);
                    countStartAndEnd105=countStartAndEnd();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) {retval.startVal =countStartAndEnd105; retval.endVal =countStartAndEnd105;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "collect"



    // $ANTLR start "countStart"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:299:1: countStart returns [int value] : POSITIVE_INT_VAL ;
    public final int countStart() throws RecognitionException {
        int value = 0;


        CommonTree POSITIVE_INT_VAL106=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:300:2: ( POSITIVE_INT_VAL )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:300:3: POSITIVE_INT_VAL
            {
            POSITIVE_INT_VAL106=(CommonTree)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_countStart1743); if (state.failed) return value;

            if ( state.backtracking==0 ) {value =Integer.parseInt((POSITIVE_INT_VAL106!=null?POSITIVE_INT_VAL106.getText():null));}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "countStart"



    // $ANTLR start "countEnd"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:303:1: countEnd returns [int value] : POSITIVE_INT_VAL ;
    public final int countEnd() throws RecognitionException {
        int value = 0;


        CommonTree POSITIVE_INT_VAL107=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:304:2: ( POSITIVE_INT_VAL )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:304:3: POSITIVE_INT_VAL
            {
            POSITIVE_INT_VAL107=(CommonTree)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_countEnd1760); if (state.failed) return value;

            if ( state.backtracking==0 ) {value =Integer.parseInt((POSITIVE_INT_VAL107!=null?POSITIVE_INT_VAL107.getText():null));}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "countEnd"



    // $ANTLR start "countStartAndEnd"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:307:1: countStartAndEnd returns [int value] : POSITIVE_INT_VAL ;
    public final int countStartAndEnd() throws RecognitionException {
        int value = 0;


        CommonTree POSITIVE_INT_VAL108=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:308:2: ( POSITIVE_INT_VAL )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:308:3: POSITIVE_INT_VAL
            {
            POSITIVE_INT_VAL108=(CommonTree)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_countStartAndEnd1778); if (state.failed) return value;

            if ( state.backtracking==0 ) {value =Integer.parseInt((POSITIVE_INT_VAL108!=null?POSITIVE_INT_VAL108.getText():null));}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "countStartAndEnd"



    // $ANTLR start "condition"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:313:1: condition returns [Condition condition] : ^( CONDITION conditionExpression ) ;
    public final Condition condition() throws RecognitionException {
        Condition condition = null;


        Condition conditionExpression109 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:314:2: ( ^( CONDITION conditionExpression ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:314:4: ^( CONDITION conditionExpression )
            {
            match(input,CONDITION,FOLLOW_CONDITION_in_condition1801); if (state.failed) return condition;

            match(input, Token.DOWN, null); if (state.failed) return condition;
            pushFollow(FOLLOW_conditionExpression_in_condition1803);
            conditionExpression109=conditionExpression();

            state._fsp--;
            if (state.failed) return condition;

            if ( state.backtracking==0 ) {condition =conditionExpression109;}

            match(input, Token.UP, null); if (state.failed) return condition;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return condition;
    }
    // $ANTLR end "condition"



    // $ANTLR start "conditionExpression"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:317:1: conditionExpression returns [Condition condition] : ( ^( 'or' c1= conditionExpression c2= conditionExpression ) | ^( 'and' c1= conditionExpression c2= conditionExpression ) | ^( compareOperation m1= expression m2= expression ) | ^( 'not' c= conditionExpression ) | ^( CONDITION_FUNCTION extensionId functionId ( parameters )? ) | boolVal );
    public final Condition conditionExpression() throws RecognitionException {
        Condition condition = null;


        Condition c1 =null;

        Condition c2 =null;

        Expression m1 =null;

        Expression m2 =null;

        Condition c =null;

        Condition.Operator compareOperation110 =null;

        String extensionId111 =null;

        String functionId112 =null;

        Expression[] parameters113 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:318:5: ( ^( 'or' c1= conditionExpression c2= conditionExpression ) | ^( 'and' c1= conditionExpression c2= conditionExpression ) | ^( compareOperation m1= expression m2= expression ) | ^( 'not' c= conditionExpression ) | ^( CONDITION_FUNCTION extensionId functionId ( parameters )? ) | boolVal )
            int alt61=6;
            switch ( input.LA(1) ) {
            case 110:
                {
                alt61=1;
                }
                break;
            case 73:
                {
                alt61=2;
                }
                break;
            case 49:
            case 62:
            case 63:
            case 65:
            case 66:
            case 67:
            case 78:
            case 95:
                {
                alt61=3;
                }
                break;
            case 108:
                {
                alt61=4;
                }
                break;
            case CONDITION_FUNCTION:
                {
                alt61=5;
                }
                break;
            case BOOL_VAL:
                {
                alt61=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return condition;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }

            switch (alt61) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:318:7: ^( 'or' c1= conditionExpression c2= conditionExpression )
                    {
                    match(input,110,FOLLOW_110_in_conditionExpression1825); if (state.failed) return condition;

                    match(input, Token.DOWN, null); if (state.failed) return condition;
                    pushFollow(FOLLOW_conditionExpression_in_conditionExpression1829);
                    c1=conditionExpression();

                    state._fsp--;
                    if (state.failed) return condition;

                    pushFollow(FOLLOW_conditionExpression_in_conditionExpression1833);
                    c2=conditionExpression();

                    state._fsp--;
                    if (state.failed) return condition;

                    match(input, Token.UP, null); if (state.failed) return condition;


                    if ( state.backtracking==0 ) {condition =Condition.or(c1,c2);}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:319:7: ^( 'and' c1= conditionExpression c2= conditionExpression )
                    {
                    match(input,73,FOLLOW_73_in_conditionExpression1846); if (state.failed) return condition;

                    match(input, Token.DOWN, null); if (state.failed) return condition;
                    pushFollow(FOLLOW_conditionExpression_in_conditionExpression1850);
                    c1=conditionExpression();

                    state._fsp--;
                    if (state.failed) return condition;

                    pushFollow(FOLLOW_conditionExpression_in_conditionExpression1854);
                    c2=conditionExpression();

                    state._fsp--;
                    if (state.failed) return condition;

                    match(input, Token.UP, null); if (state.failed) return condition;


                    if ( state.backtracking==0 ) {condition =Condition.and(c1,c2);}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:320:7: ^( compareOperation m1= expression m2= expression )
                    {
                    pushFollow(FOLLOW_compareOperation_in_conditionExpression1868);
                    compareOperation110=compareOperation();

                    state._fsp--;
                    if (state.failed) return condition;

                    match(input, Token.DOWN, null); if (state.failed) return condition;
                    pushFollow(FOLLOW_expression_in_conditionExpression1872);
                    m1=expression();

                    state._fsp--;
                    if (state.failed) return condition;

                    pushFollow(FOLLOW_expression_in_conditionExpression1876);
                    m2=expression();

                    state._fsp--;
                    if (state.failed) return condition;

                    match(input, Token.UP, null); if (state.failed) return condition;


                    if ( state.backtracking==0 ) {condition =Condition.compare(m1,compareOperation110,m2);}

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:321:7: ^( 'not' c= conditionExpression )
                    {
                    match(input,108,FOLLOW_108_in_conditionExpression1896); if (state.failed) return condition;

                    match(input, Token.DOWN, null); if (state.failed) return condition;
                    pushFollow(FOLLOW_conditionExpression_in_conditionExpression1900);
                    c=conditionExpression();

                    state._fsp--;
                    if (state.failed) return condition;

                    match(input, Token.UP, null); if (state.failed) return condition;


                    if ( state.backtracking==0 ) {condition =Condition.not(c);}

                    }
                    break;
                case 5 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:322:7: ^( CONDITION_FUNCTION extensionId functionId ( parameters )? )
                    {
                    match(input,CONDITION_FUNCTION,FOLLOW_CONDITION_FUNCTION_in_conditionExpression1919); if (state.failed) return condition;

                    match(input, Token.DOWN, null); if (state.failed) return condition;
                    pushFollow(FOLLOW_extensionId_in_conditionExpression1921);
                    extensionId111=extensionId();

                    state._fsp--;
                    if (state.failed) return condition;

                    pushFollow(FOLLOW_functionId_in_conditionExpression1923);
                    functionId112=functionId();

                    state._fsp--;
                    if (state.failed) return condition;

                    if ( state.backtracking==0 ) {condition =new ConditionExtension(extensionId111,functionId112,null);}

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:322:132: ( parameters )?
                    int alt60=2;
                    switch ( input.LA(1) ) {
                        case PARAMETERS:
                            {
                            alt60=1;
                            }
                            break;
                    }

                    switch (alt60) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:322:133: parameters
                            {
                            pushFollow(FOLLOW_parameters_in_conditionExpression1928);
                            parameters113=parameters();

                            state._fsp--;
                            if (state.failed) return condition;

                            if ( state.backtracking==0 ) {condition =new ConditionExtension(extensionId111,functionId112,parameters113);}

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return condition;


                    }
                    break;
                case 6 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:323:6: boolVal
                    {
                    pushFollow(FOLLOW_boolVal_in_conditionExpression1941);
                    boolVal();

                    state._fsp--;
                    if (state.failed) return condition;

                    if ( state.backtracking==0 ) {System.err.println("Boolean Value as condition not yet supported!");}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return condition;
    }
    // $ANTLR end "conditionExpression"



    // $ANTLR start "expression"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:326:1: expression returns [Expression expression] : ( ^( '%' e1= expression e2= expression ) | ^( '/' e1= expression e2= expression ) | ^( '*' e1= expression e2= expression ) | ^( '-' e1= expression e2= expression ) | ^( '+' e1= expression e2= expression ) | valueExpression );
    public final Expression expression() throws RecognitionException {
        Expression expression = null;


        Expression e1 =null;

        Expression e2 =null;

        Expression valueExpression114 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:327:2: ( ^( '%' e1= expression e2= expression ) | ^( '/' e1= expression e2= expression ) | ^( '*' e1= expression e2= expression ) | ^( '-' e1= expression e2= expression ) | ^( '+' e1= expression e2= expression ) | valueExpression )
            int alt62=6;
            switch ( input.LA(1) ) {
            case 51:
                {
                alt62=1;
                }
                break;
            case 59:
                {
                alt62=2;
                }
                break;
            case 54:
                {
                alt62=3;
                }
                break;
            case 57:
                {
                alt62=4;
                }
                break;
            case 55:
                {
                alt62=5;
                }
                break;
            case ATTRIBUTE:
            case CONSTANT:
            case EXTENSION_FUNCTION:
            case 75:
            case 83:
            case 86:
            case 96:
            case 100:
            case 118:
                {
                alt62=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expression;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;

            }

            switch (alt62) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:327:4: ^( '%' e1= expression e2= expression )
                    {
                    match(input,51,FOLLOW_51_in_expression1974); if (state.failed) return expression;

                    match(input, Token.DOWN, null); if (state.failed) return expression;
                    pushFollow(FOLLOW_expression_in_expression1978);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return expression;

                    pushFollow(FOLLOW_expression_in_expression1982);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return expression;

                    match(input, Token.UP, null); if (state.failed) return expression;


                    if ( state.backtracking==0 ) {expression =Expression.mod(e1,e2);}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:328:7: ^( '/' e1= expression e2= expression )
                    {
                    match(input,59,FOLLOW_59_in_expression1994); if (state.failed) return expression;

                    match(input, Token.DOWN, null); if (state.failed) return expression;
                    pushFollow(FOLLOW_expression_in_expression1998);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return expression;

                    pushFollow(FOLLOW_expression_in_expression2002);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return expression;

                    match(input, Token.UP, null); if (state.failed) return expression;


                    if ( state.backtracking==0 ) {expression =Expression.divide(e1,e2);}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:329:7: ^( '*' e1= expression e2= expression )
                    {
                    match(input,54,FOLLOW_54_in_expression2014); if (state.failed) return expression;

                    match(input, Token.DOWN, null); if (state.failed) return expression;
                    pushFollow(FOLLOW_expression_in_expression2018);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return expression;

                    pushFollow(FOLLOW_expression_in_expression2022);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return expression;

                    match(input, Token.UP, null); if (state.failed) return expression;


                    if ( state.backtracking==0 ) {expression =Expression.multiply(e1,e2);}

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:330:7: ^( '-' e1= expression e2= expression )
                    {
                    match(input,57,FOLLOW_57_in_expression2034); if (state.failed) return expression;

                    match(input, Token.DOWN, null); if (state.failed) return expression;
                    pushFollow(FOLLOW_expression_in_expression2038);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return expression;

                    pushFollow(FOLLOW_expression_in_expression2042);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return expression;

                    match(input, Token.UP, null); if (state.failed) return expression;


                    if ( state.backtracking==0 ) {expression =Expression.minus(e1,e2);}

                    }
                    break;
                case 5 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:331:7: ^( '+' e1= expression e2= expression )
                    {
                    match(input,55,FOLLOW_55_in_expression2054); if (state.failed) return expression;

                    match(input, Token.DOWN, null); if (state.failed) return expression;
                    pushFollow(FOLLOW_expression_in_expression2058);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return expression;

                    pushFollow(FOLLOW_expression_in_expression2062);
                    e2=expression();

                    state._fsp--;
                    if (state.failed) return expression;

                    match(input, Token.UP, null); if (state.failed) return expression;


                    if ( state.backtracking==0 ) {expression =Expression.add(e1,e2);}

                    }
                    break;
                case 6 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:332:6: valueExpression
                    {
                    pushFollow(FOLLOW_valueExpression_in_expression2072);
                    valueExpression114=valueExpression();

                    state._fsp--;
                    if (state.failed) return expression;

                    if ( state.backtracking==0 ) {expression =valueExpression114;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expression;
    }
    // $ANTLR end "expression"



    // $ANTLR start "valueExpression"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:335:1: valueExpression returns [Expression expression] : ( constant | type | attributeVariable | ^( EXTENSION_FUNCTION extensionId functionId ( parameters )? ) );
    public final Expression valueExpression() throws RecognitionException {
        Expression expression = null;


        Expression constant115 =null;

        Attribute.Type type116 =null;

        Variable attributeVariable117 =null;

        String extensionId118 =null;

        String functionId119 =null;

        Expression[] parameters120 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:336:5: ( constant | type | attributeVariable | ^( EXTENSION_FUNCTION extensionId functionId ( parameters )? ) )
            int alt64=4;
            switch ( input.LA(1) ) {
            case CONSTANT:
                {
                alt64=1;
                }
                break;
            case 75:
            case 83:
            case 86:
            case 96:
            case 100:
            case 118:
                {
                alt64=2;
                }
                break;
            case ATTRIBUTE:
                {
                alt64=3;
                }
                break;
            case EXTENSION_FUNCTION:
                {
                alt64=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expression;}
                NoViableAltException nvae =
                    new NoViableAltException("", 64, 0, input);

                throw nvae;

            }

            switch (alt64) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:336:6: constant
                    {
                    pushFollow(FOLLOW_constant_in_valueExpression2101);
                    constant115=constant();

                    state._fsp--;
                    if (state.failed) return expression;

                    if ( state.backtracking==0 ) {expression =constant115;}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:337:6: type
                    {
                    pushFollow(FOLLOW_type_in_valueExpression2113);
                    type116=type();

                    state._fsp--;
                    if (state.failed) return expression;

                    if ( state.backtracking==0 ) {expression =Expression.type(type116);}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:338:6: attributeVariable
                    {
                    pushFollow(FOLLOW_attributeVariable_in_valueExpression2129);
                    attributeVariable117=attributeVariable();

                    state._fsp--;
                    if (state.failed) return expression;

                    if ( state.backtracking==0 ) {expression =attributeVariable117;}

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:339:6: ^( EXTENSION_FUNCTION extensionId functionId ( parameters )? )
                    {
                    match(input,EXTENSION_FUNCTION,FOLLOW_EXTENSION_FUNCTION_in_valueExpression2140); if (state.failed) return expression;

                    match(input, Token.DOWN, null); if (state.failed) return expression;
                    pushFollow(FOLLOW_extensionId_in_valueExpression2142);
                    extensionId118=extensionId();

                    state._fsp--;
                    if (state.failed) return expression;

                    pushFollow(FOLLOW_functionId_in_valueExpression2144);
                    functionId119=functionId();

                    state._fsp--;
                    if (state.failed) return expression;

                    if ( state.backtracking==0 ) {expression =new ExpressionExtension(extensionId118,functionId119, null);}

                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:339:134: ( parameters )?
                    int alt63=2;
                    switch ( input.LA(1) ) {
                        case PARAMETERS:
                            {
                            alt63=1;
                            }
                            break;
                    }

                    switch (alt63) {
                        case 1 :
                            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:339:135: parameters
                            {
                            pushFollow(FOLLOW_parameters_in_valueExpression2149);
                            parameters120=parameters();

                            state._fsp--;
                            if (state.failed) return expression;

                            if ( state.backtracking==0 ) {expression =new ExpressionExtension(extensionId118,functionId119,parameters120);}

                            }
                            break;

                    }


                    match(input, Token.UP, null); if (state.failed) return expression;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expression;
    }
    // $ANTLR end "valueExpression"



    // $ANTLR start "constant"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:345:1: constant returns [Expression expression] : ( ^( CONSTANT intVal ) | ^( CONSTANT longVal ) | ^( CONSTANT floatVal ) | ^( CONSTANT doubleVal ) | ^( CONSTANT boolVal ) | ^( CONSTANT stringVal ) | ^( CONSTANT timeExpr ) );
    public final Expression constant() throws RecognitionException {
        Expression expression = null;


        int intVal121 =0;

        long longVal122 =0;

        float floatVal123 =0.0f;

        double doubleVal124 =0.0;

        boolean boolVal125 =false;

        String stringVal126 =null;

        long timeExpr127 =0;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:346:2: ( ^( CONSTANT intVal ) | ^( CONSTANT longVal ) | ^( CONSTANT floatVal ) | ^( CONSTANT doubleVal ) | ^( CONSTANT boolVal ) | ^( CONSTANT stringVal ) | ^( CONSTANT timeExpr ) )
            int alt65=7;
            switch ( input.LA(1) ) {
            case CONSTANT:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case SIGNED_VAL:
                        {
                        switch ( input.LA(4) ) {
                        case DOWN:
                            {
                            switch ( input.LA(5) ) {
                            case POSITIVE_INT_VAL:
                                {
                                alt65=1;
                                }
                                break;
                            case POSITIVE_LONG_VAL:
                                {
                                alt65=2;
                                }
                                break;
                            case POSITIVE_FLOAT_VAL:
                                {
                                alt65=3;
                                }
                                break;
                            case POSITIVE_DOUBLE_VAL:
                                {
                                alt65=4;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return expression;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 65, 7, input);

                                throw nvae;

                            }

                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return expression;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 65, 3, input);

                            throw nvae;

                        }

                        }
                        break;
                    case BOOL_VAL:
                        {
                        alt65=5;
                        }
                        break;
                    case STRING_VAL:
                        {
                        alt65=6;
                        }
                        break;
                    case TIME_EXP:
                        {
                        alt65=7;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return expression;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 65, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return expression;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 65, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return expression;}
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;

            }

            switch (alt65) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:346:4: ^( CONSTANT intVal )
                    {
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_constant2177); if (state.failed) return expression;

                    match(input, Token.DOWN, null); if (state.failed) return expression;
                    pushFollow(FOLLOW_intVal_in_constant2179);
                    intVal121=intVal();

                    state._fsp--;
                    if (state.failed) return expression;

                    match(input, Token.UP, null); if (state.failed) return expression;


                    if ( state.backtracking==0 ) {expression =Expression.value(intVal121);}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:347:4: ^( CONSTANT longVal )
                    {
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_constant2191); if (state.failed) return expression;

                    match(input, Token.DOWN, null); if (state.failed) return expression;
                    pushFollow(FOLLOW_longVal_in_constant2193);
                    longVal122=longVal();

                    state._fsp--;
                    if (state.failed) return expression;

                    match(input, Token.UP, null); if (state.failed) return expression;


                    if ( state.backtracking==0 ) {expression =Expression.value(longVal122);}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:348:4: ^( CONSTANT floatVal )
                    {
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_constant2204); if (state.failed) return expression;

                    match(input, Token.DOWN, null); if (state.failed) return expression;
                    pushFollow(FOLLOW_floatVal_in_constant2206);
                    floatVal123=floatVal();

                    state._fsp--;
                    if (state.failed) return expression;

                    match(input, Token.UP, null); if (state.failed) return expression;


                    if ( state.backtracking==0 ) {expression =Expression.value(floatVal123);}

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:349:4: ^( CONSTANT doubleVal )
                    {
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_constant2217); if (state.failed) return expression;

                    match(input, Token.DOWN, null); if (state.failed) return expression;
                    pushFollow(FOLLOW_doubleVal_in_constant2219);
                    doubleVal124=doubleVal();

                    state._fsp--;
                    if (state.failed) return expression;

                    match(input, Token.UP, null); if (state.failed) return expression;


                    if ( state.backtracking==0 ) {expression =Expression.value(doubleVal124);}

                    }
                    break;
                case 5 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:350:4: ^( CONSTANT boolVal )
                    {
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_constant2229); if (state.failed) return expression;

                    match(input, Token.DOWN, null); if (state.failed) return expression;
                    pushFollow(FOLLOW_boolVal_in_constant2231);
                    boolVal125=boolVal();

                    state._fsp--;
                    if (state.failed) return expression;

                    match(input, Token.UP, null); if (state.failed) return expression;


                    if ( state.backtracking==0 ) {expression =Expression.value(boolVal125);}

                    }
                    break;
                case 6 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:351:4: ^( CONSTANT stringVal )
                    {
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_constant2242); if (state.failed) return expression;

                    match(input, Token.DOWN, null); if (state.failed) return expression;
                    pushFollow(FOLLOW_stringVal_in_constant2244);
                    stringVal126=stringVal();

                    state._fsp--;
                    if (state.failed) return expression;

                    match(input, Token.UP, null); if (state.failed) return expression;


                    if ( state.backtracking==0 ) {expression =Expression.value(stringVal126);}

                    }
                    break;
                case 7 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:352:4: ^( CONSTANT timeExpr )
                    {
                    match(input,CONSTANT,FOLLOW_CONSTANT_in_constant2254); if (state.failed) return expression;

                    match(input, Token.DOWN, null); if (state.failed) return expression;
                    pushFollow(FOLLOW_timeExpr_in_constant2256);
                    timeExpr127=timeExpr();

                    state._fsp--;
                    if (state.failed) return expression;

                    match(input, Token.UP, null); if (state.failed) return expression;


                    if ( state.backtracking==0 ) {expression =Expression.value(timeExpr127);}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expression;
    }
    // $ANTLR end "constant"



    // $ANTLR start "timeExpr"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:355:2: timeExpr returns [long value] : ^( TIME_EXP ( yearValue )? ( monthValue )? ( weekValue )? ( dayValue )? ( hourValue )? ( minuteValue )? ( secondValue )? ( milliSecondValue )? ) ;
    public final long timeExpr() throws RecognitionException {
        long value = 0;


        long yearValue128 =0;

        long monthValue129 =0;

        long weekValue130 =0;

        long dayValue131 =0;

        long hourValue132 =0;

        long minuteValue133 =0;

        long secondValue134 =0;

        long milliSecondValue135 =0;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:356:2: ( ^( TIME_EXP ( yearValue )? ( monthValue )? ( weekValue )? ( dayValue )? ( hourValue )? ( minuteValue )? ( secondValue )? ( milliSecondValue )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:356:3: ^( TIME_EXP ( yearValue )? ( monthValue )? ( weekValue )? ( dayValue )? ( hourValue )? ( minuteValue )? ( secondValue )? ( milliSecondValue )? )
            {
            match(input,TIME_EXP,FOLLOW_TIME_EXP_in_timeExpr2280); if (state.failed) return value;

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); if (state.failed) return value;
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:356:14: ( yearValue )?
                int alt66=2;
                switch ( input.LA(1) ) {
                    case POSITIVE_INT_VAL:
                        {
                        switch ( input.LA(2) ) {
                            case 125:
                            case 126:
                                {
                                alt66=1;
                                }
                                break;
                        }

                        }
                        break;
                }

                switch (alt66) {
                    case 1 :
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:356:15: yearValue
                        {
                        pushFollow(FOLLOW_yearValue_in_timeExpr2283);
                        yearValue128=yearValue();

                        state._fsp--;
                        if (state.failed) return value;

                        if ( state.backtracking==0 ) {value =  yearValue128;}

                        }
                        break;

                }


                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:356:59: ( monthValue )?
                int alt67=2;
                switch ( input.LA(1) ) {
                    case POSITIVE_INT_VAL:
                        {
                        switch ( input.LA(2) ) {
                            case 106:
                            case 107:
                                {
                                alt67=1;
                                }
                                break;
                        }

                        }
                        break;
                }

                switch (alt67) {
                    case 1 :
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:356:60: monthValue
                        {
                        pushFollow(FOLLOW_monthValue_in_timeExpr2292);
                        monthValue129=monthValue();

                        state._fsp--;
                        if (state.failed) return value;

                        if ( state.backtracking==0 ) {value =  monthValue129;}

                        }
                        break;

                }


                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:356:106: ( weekValue )?
                int alt68=2;
                switch ( input.LA(1) ) {
                    case POSITIVE_INT_VAL:
                        {
                        switch ( input.LA(2) ) {
                            case 121:
                            case 122:
                                {
                                alt68=1;
                                }
                                break;
                        }

                        }
                        break;
                }

                switch (alt68) {
                    case 1 :
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:356:107: weekValue
                        {
                        pushFollow(FOLLOW_weekValue_in_timeExpr2301);
                        weekValue130=weekValue();

                        state._fsp--;
                        if (state.failed) return value;

                        if ( state.backtracking==0 ) {value =  weekValue130;}

                        }
                        break;

                }


                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:356:151: ( dayValue )?
                int alt69=2;
                switch ( input.LA(1) ) {
                    case POSITIVE_INT_VAL:
                        {
                        switch ( input.LA(2) ) {
                            case 80:
                            case 81:
                                {
                                alt69=1;
                                }
                                break;
                        }

                        }
                        break;
                }

                switch (alt69) {
                    case 1 :
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:356:152: dayValue
                        {
                        pushFollow(FOLLOW_dayValue_in_timeExpr2310);
                        dayValue131=dayValue();

                        state._fsp--;
                        if (state.failed) return value;

                        if ( state.backtracking==0 ) {value =  dayValue131;}

                        }
                        break;

                }


                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:356:195: ( hourValue )?
                int alt70=2;
                switch ( input.LA(1) ) {
                    case POSITIVE_INT_VAL:
                        {
                        switch ( input.LA(2) ) {
                            case 91:
                            case 92:
                                {
                                alt70=1;
                                }
                                break;
                        }

                        }
                        break;
                }

                switch (alt70) {
                    case 1 :
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:356:196: hourValue
                        {
                        pushFollow(FOLLOW_hourValue_in_timeExpr2320);
                        hourValue132=hourValue();

                        state._fsp--;
                        if (state.failed) return value;

                        if ( state.backtracking==0 ) {value +=  hourValue132;}

                        }
                        break;

                }


                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:356:241: ( minuteValue )?
                int alt71=2;
                switch ( input.LA(1) ) {
                    case POSITIVE_INT_VAL:
                        {
                        switch ( input.LA(2) ) {
                            case 103:
                            case 104:
                            case 105:
                                {
                                alt71=1;
                                }
                                break;
                        }

                        }
                        break;
                }

                switch (alt71) {
                    case 1 :
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:356:242: minuteValue
                        {
                        pushFollow(FOLLOW_minuteValue_in_timeExpr2329);
                        minuteValue133=minuteValue();

                        state._fsp--;
                        if (state.failed) return value;

                        if ( state.backtracking==0 ) {value +=  minuteValue133;}

                        }
                        break;

                }


                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:357:3: ( secondValue )?
                int alt72=2;
                switch ( input.LA(1) ) {
                    case POSITIVE_INT_VAL:
                        {
                        switch ( input.LA(2) ) {
                            case 114:
                            case 115:
                            case 116:
                                {
                                alt72=1;
                                }
                                break;
                        }

                        }
                        break;
                }

                switch (alt72) {
                    case 1 :
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:357:4: secondValue
                        {
                        pushFollow(FOLLOW_secondValue_in_timeExpr2340);
                        secondValue134=secondValue();

                        state._fsp--;
                        if (state.failed) return value;

                        if ( state.backtracking==0 ) {value +=  secondValue134;}

                        }
                        break;

                }


                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:357:53: ( milliSecondValue )?
                int alt73=2;
                switch ( input.LA(1) ) {
                    case POSITIVE_INT_VAL:
                        {
                        alt73=1;
                        }
                        break;
                }

                switch (alt73) {
                    case 1 :
                        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:357:54: milliSecondValue
                        {
                        pushFollow(FOLLOW_milliSecondValue_in_timeExpr2349);
                        milliSecondValue135=milliSecondValue();

                        state._fsp--;
                        if (state.failed) return value;

                        if ( state.backtracking==0 ) {value +=  milliSecondValue135;}

                        }
                        break;

                }


                match(input, Token.UP, null); if (state.failed) return value;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "timeExpr"



    // $ANTLR start "yearValue"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:360:1: yearValue returns [long value] : a= POSITIVE_INT_VAL ( 'years' | 'year' ) ;
    public final long yearValue() throws RecognitionException {
        long value = 0;


        CommonTree a=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:361:2: (a= POSITIVE_INT_VAL ( 'years' | 'year' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:361:4: a= POSITIVE_INT_VAL ( 'years' | 'year' )
            {
            a=(CommonTree)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_yearValue2375); if (state.failed) return value;

            if ( (input.LA(1) >= 125 && input.LA(1) <= 126) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) {value =  Time.year(Integer.parseInt((a!=null?a.getText():null))).value();}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "yearValue"



    // $ANTLR start "monthValue"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:364:1: monthValue returns [long value] : a= POSITIVE_INT_VAL ( 'months' | 'month' ) ;
    public final long monthValue() throws RecognitionException {
        long value = 0;


        CommonTree a=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:365:2: (a= POSITIVE_INT_VAL ( 'months' | 'month' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:365:4: a= POSITIVE_INT_VAL ( 'months' | 'month' )
            {
            a=(CommonTree)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_monthValue2406); if (state.failed) return value;

            if ( (input.LA(1) >= 106 && input.LA(1) <= 107) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) {value =  Time.month(Integer.parseInt((a!=null?a.getText():null))).value();}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "monthValue"



    // $ANTLR start "weekValue"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:368:1: weekValue returns [long value] : a= POSITIVE_INT_VAL ( 'weeks' | 'week' ) ;
    public final long weekValue() throws RecognitionException {
        long value = 0;


        CommonTree a=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:369:2: (a= POSITIVE_INT_VAL ( 'weeks' | 'week' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:369:4: a= POSITIVE_INT_VAL ( 'weeks' | 'week' )
            {
            a=(CommonTree)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_weekValue2436); if (state.failed) return value;

            if ( (input.LA(1) >= 121 && input.LA(1) <= 122) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) {value =  Time.week(Integer.parseInt((a!=null?a.getText():null))).value();}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "weekValue"



    // $ANTLR start "dayValue"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:372:1: dayValue returns [long value] : a= POSITIVE_INT_VAL ( 'days' | 'day' ) ;
    public final long dayValue() throws RecognitionException {
        long value = 0;


        CommonTree a=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:373:2: (a= POSITIVE_INT_VAL ( 'days' | 'day' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:373:4: a= POSITIVE_INT_VAL ( 'days' | 'day' )
            {
            a=(CommonTree)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_dayValue2468); if (state.failed) return value;

            if ( (input.LA(1) >= 80 && input.LA(1) <= 81) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) {value =  Time.day(Integer.parseInt((a!=null?a.getText():null))).value();}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "dayValue"



    // $ANTLR start "hourValue"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:376:1: hourValue returns [long value] : a= POSITIVE_INT_VAL ( 'hours' | 'hour' ) ;
    public final long hourValue() throws RecognitionException {
        long value = 0;


        CommonTree a=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:377:2: (a= POSITIVE_INT_VAL ( 'hours' | 'hour' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:377:4: a= POSITIVE_INT_VAL ( 'hours' | 'hour' )
            {
            a=(CommonTree)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_hourValue2499); if (state.failed) return value;

            if ( (input.LA(1) >= 91 && input.LA(1) <= 92) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) {value =  Time.hour(Integer.parseInt((a!=null?a.getText():null))).value();}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "hourValue"



    // $ANTLR start "minuteValue"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:380:1: minuteValue returns [long value] : a= POSITIVE_INT_VAL ( 'minutes' | 'minute' | 'min' ) ;
    public final long minuteValue() throws RecognitionException {
        long value = 0;


        CommonTree a=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:381:2: (a= POSITIVE_INT_VAL ( 'minutes' | 'minute' | 'min' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:381:4: a= POSITIVE_INT_VAL ( 'minutes' | 'minute' | 'min' )
            {
            a=(CommonTree)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_minuteValue2529); if (state.failed) return value;

            if ( (input.LA(1) >= 103 && input.LA(1) <= 105) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) {value = Time.minute(Integer.parseInt((a!=null?a.getText():null))).value();}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "minuteValue"



    // $ANTLR start "secondValue"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:384:1: secondValue returns [long value] : a= POSITIVE_INT_VAL ( 'seconds' | 'second' | 'sec' ) ;
    public final long secondValue() throws RecognitionException {
        long value = 0;


        CommonTree a=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:385:2: (a= POSITIVE_INT_VAL ( 'seconds' | 'second' | 'sec' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:385:4: a= POSITIVE_INT_VAL ( 'seconds' | 'second' | 'sec' )
            {
            a=(CommonTree)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_secondValue2561); if (state.failed) return value;

            if ( (input.LA(1) >= 114 && input.LA(1) <= 116) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) {value =  Time.sec(Integer.parseInt((a!=null?a.getText():null))).value();}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "secondValue"



    // $ANTLR start "milliSecondValue"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:388:1: milliSecondValue returns [long value] : a= POSITIVE_INT_VAL ( 'milliseconds' | 'millisecond' ) ;
    public final long milliSecondValue() throws RecognitionException {
        long value = 0;


        CommonTree a=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:389:2: (a= POSITIVE_INT_VAL ( 'milliseconds' | 'millisecond' ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:389:4: a= POSITIVE_INT_VAL ( 'milliseconds' | 'millisecond' )
            {
            a=(CommonTree)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_milliSecondValue2595); if (state.failed) return value;

            if ( (input.LA(1) >= 101 && input.LA(1) <= 102) ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return value;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            if ( state.backtracking==0 ) {value =  Time.milliSec(Integer.parseInt((a!=null?a.getText():null))).value();}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "milliSecondValue"



    // $ANTLR start "streamId"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:393:1: streamId returns [String value] : id ;
    public final String streamId() throws RecognitionException {
        String value = null;


        String id136 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:394:2: ( id )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:394:4: id
            {
            pushFollow(FOLLOW_id_in_streamId2622);
            id136=id();

            state._fsp--;
            if (state.failed) return value;

            if ( state.backtracking==0 ) {value =id136;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "streamId"



    // $ANTLR start "attributeVariable"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:397:1: attributeVariable returns [Variable variable] : ( streamPositionAttributeName | streamAttributeName | attributeName );
    public final Variable attributeVariable() throws RecognitionException {
        Variable variable = null;


        SiddhiQLGrammarWalker.streamPositionAttributeName_return streamPositionAttributeName137 =null;

        SiddhiQLGrammarWalker.streamAttributeName_return streamAttributeName138 =null;

        String attributeName139 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:398:2: ( streamPositionAttributeName | streamAttributeName | attributeName )
            int alt74=3;
            switch ( input.LA(1) ) {
            case ATTRIBUTE:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case ID:
                        {
                        switch ( input.LA(4) ) {
                        case DOWN:
                            {
                            alt74=1;
                            }
                            break;
                        case ID:
                        case ID_QUOTES:
                            {
                            alt74=2;
                            }
                            break;
                        case UP:
                            {
                            alt74=3;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return variable;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 3, input);

                            throw nvae;

                        }

                        }
                        break;
                    case ID_QUOTES:
                        {
                        switch ( input.LA(4) ) {
                        case DOWN:
                            {
                            alt74=1;
                            }
                            break;
                        case ID:
                        case ID_QUOTES:
                            {
                            alt74=2;
                            }
                            break;
                        case UP:
                            {
                            alt74=3;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return variable;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 74, 4, input);

                            throw nvae;

                        }

                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return variable;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 74, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return variable;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 74, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return variable;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;

            }

            switch (alt74) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:398:3: streamPositionAttributeName
                    {
                    pushFollow(FOLLOW_streamPositionAttributeName_in_attributeVariable2639);
                    streamPositionAttributeName137=streamPositionAttributeName();

                    state._fsp--;
                    if (state.failed) return variable;

                    if ( state.backtracking==0 ) {variable =Expression.variable((streamPositionAttributeName137!=null?streamPositionAttributeName137.stream:null),(streamPositionAttributeName137!=null?streamPositionAttributeName137.position:0),(streamPositionAttributeName137!=null?streamPositionAttributeName137.attribute:null));}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:399:6: streamAttributeName
                    {
                    pushFollow(FOLLOW_streamAttributeName_in_attributeVariable2648);
                    streamAttributeName138=streamAttributeName();

                    state._fsp--;
                    if (state.failed) return variable;

                    if ( state.backtracking==0 ) {variable =Expression.variable((streamAttributeName138!=null?streamAttributeName138.stream:null),(streamAttributeName138!=null?streamAttributeName138.attribute:null));}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:400:6: attributeName
                    {
                    pushFollow(FOLLOW_attributeName_in_attributeVariable2660);
                    attributeName139=attributeName();

                    state._fsp--;
                    if (state.failed) return variable;

                    if ( state.backtracking==0 ) {variable =Expression.variable(attributeName139);}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return variable;
    }
    // $ANTLR end "attributeVariable"


    public static class streamPositionAttributeName_return extends TreeRuleReturnScope {
        public String stream;
        public int position;
        public String attribute;
    };


    // $ANTLR start "streamPositionAttributeName"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:403:1: streamPositionAttributeName returns [String stream, int position, String attribute] : ^( ATTRIBUTE ^( streamId POSITIVE_INT_VAL ) id ) ;
    public final SiddhiQLGrammarWalker.streamPositionAttributeName_return streamPositionAttributeName() throws RecognitionException {
        SiddhiQLGrammarWalker.streamPositionAttributeName_return retval = new SiddhiQLGrammarWalker.streamPositionAttributeName_return();
        retval.start = input.LT(1);


        CommonTree POSITIVE_INT_VAL141=null;
        String streamId140 =null;

        String id142 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:404:2: ( ^( ATTRIBUTE ^( streamId POSITIVE_INT_VAL ) id ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:404:4: ^( ATTRIBUTE ^( streamId POSITIVE_INT_VAL ) id )
            {
            match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_streamPositionAttributeName2683); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            pushFollow(FOLLOW_streamId_in_streamPositionAttributeName2686);
            streamId140=streamId();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.stream =streamId140;}

            match(input, Token.DOWN, null); if (state.failed) return retval;
            POSITIVE_INT_VAL141=(CommonTree)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_streamPositionAttributeName2690); if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.position =Integer.parseInt((POSITIVE_INT_VAL141!=null?POSITIVE_INT_VAL141.getText():null));}

            match(input, Token.UP, null); if (state.failed) return retval;


            pushFollow(FOLLOW_id_in_streamPositionAttributeName2695);
            id142=id();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.attribute =id142;}

            match(input, Token.UP, null); if (state.failed) return retval;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "streamPositionAttributeName"


    public static class streamAttributeName_return extends TreeRuleReturnScope {
        public String stream;
        public String attribute;
    };


    // $ANTLR start "streamAttributeName"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:407:1: streamAttributeName returns [String stream, String attribute] : ^( ATTRIBUTE ( streamId ) id ) ;
    public final SiddhiQLGrammarWalker.streamAttributeName_return streamAttributeName() throws RecognitionException {
        SiddhiQLGrammarWalker.streamAttributeName_return retval = new SiddhiQLGrammarWalker.streamAttributeName_return();
        retval.start = input.LT(1);


        String streamId143 =null;

        String id144 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:408:2: ( ^( ATTRIBUTE ( streamId ) id ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:408:3: ^( ATTRIBUTE ( streamId ) id )
            {
            match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_streamAttributeName2716); if (state.failed) return retval;

            match(input, Token.DOWN, null); if (state.failed) return retval;
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:408:16: ( streamId )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:408:17: streamId
            {
            pushFollow(FOLLOW_streamId_in_streamAttributeName2719);
            streamId143=streamId();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.stream =streamId143;}

            }


            pushFollow(FOLLOW_id_in_streamAttributeName2724);
            id144=id();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) {retval.attribute =id144;}

            match(input, Token.UP, null); if (state.failed) return retval;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "streamAttributeName"



    // $ANTLR start "attributeName"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:411:1: attributeName returns [String value] : ^( ATTRIBUTE id ) ;
    public final String attributeName() throws RecognitionException {
        String value = null;


        String id145 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:412:2: ( ^( ATTRIBUTE id ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:412:3: ^( ATTRIBUTE id )
            {
            match(input,ATTRIBUTE,FOLLOW_ATTRIBUTE_in_attributeName2744); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            pushFollow(FOLLOW_id_in_attributeName2746);
            id145=id();

            state._fsp--;
            if (state.failed) return value;

            if ( state.backtracking==0 ) {value =id145;}

            match(input, Token.UP, null); if (state.failed) return value;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "attributeName"



    // $ANTLR start "join"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:415:1: join returns [JoinStream.Type type] : ( ^( 'join' ^( 'outer' 'left' ) ) | ^( 'join' ^( 'outer' 'right' ) ) | ^( 'join' ^( 'outer' 'full' ) ) | ^( 'join' 'inner' ) );
    public final JoinStream.Type join() throws RecognitionException {
        JoinStream.Type type = null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:416:2: ( ^( 'join' ^( 'outer' 'left' ) ) | ^( 'join' ^( 'outer' 'right' ) ) | ^( 'join' ^( 'outer' 'full' ) ) | ^( 'join' 'inner' ) )
            int alt75=4;
            switch ( input.LA(1) ) {
            case 98:
                {
                switch ( input.LA(2) ) {
                case DOWN:
                    {
                    switch ( input.LA(3) ) {
                    case 111:
                        {
                        switch ( input.LA(4) ) {
                        case DOWN:
                            {
                            switch ( input.LA(5) ) {
                            case 99:
                                {
                                alt75=1;
                                }
                                break;
                            case 113:
                                {
                                alt75=2;
                                }
                                break;
                            case 88:
                                {
                                alt75=3;
                                }
                                break;
                            default:
                                if (state.backtracking>0) {state.failed=true; return type;}
                                NoViableAltException nvae =
                                    new NoViableAltException("", 75, 5, input);

                                throw nvae;

                            }

                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return type;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 75, 3, input);

                            throw nvae;

                        }

                        }
                        break;
                    case 93:
                        {
                        alt75=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return type;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 75, 2, input);

                        throw nvae;

                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return type;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 75, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return type;}
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;

            }

            switch (alt75) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:416:5: ^( 'join' ^( 'outer' 'left' ) )
                    {
                    match(input,98,FOLLOW_98_in_join2768); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    match(input,111,FOLLOW_111_in_join2771); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    match(input,99,FOLLOW_99_in_join2773); if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    match(input, Token.UP, null); if (state.failed) return type;


                    if ( state.backtracking==0 ) {type =JoinStream.Type.LEFT_OUTER_JOIN;}

                    if ( state.backtracking==0 ) {System.err.println("Left outer join not yet supported!");}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:417:5: ^( 'join' ^( 'outer' 'right' ) )
                    {
                    match(input,98,FOLLOW_98_in_join2787); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    match(input,111,FOLLOW_111_in_join2790); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    match(input,113,FOLLOW_113_in_join2792); if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    match(input, Token.UP, null); if (state.failed) return type;


                    if ( state.backtracking==0 ) {type =JoinStream.Type.RIGHT_OUTER_JOIN;}

                    if ( state.backtracking==0 ) {System.err.println("Right outer join not yet supported!");}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:418:5: ^( 'join' ^( 'outer' 'full' ) )
                    {
                    match(input,98,FOLLOW_98_in_join2806); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    match(input,111,FOLLOW_111_in_join2809); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    match(input,88,FOLLOW_88_in_join2811); if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    match(input, Token.UP, null); if (state.failed) return type;


                    if ( state.backtracking==0 ) {type =JoinStream.Type.FULL_OUTER_JOIN;}

                    if ( state.backtracking==0 ) {System.err.println("Full outer join not yet supported!");}

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:419:4: ^( 'join' 'inner' )
                    {
                    match(input,98,FOLLOW_98_in_join2823); if (state.failed) return type;

                    match(input, Token.DOWN, null); if (state.failed) return type;
                    match(input,93,FOLLOW_93_in_join2825); if (state.failed) return type;

                    match(input, Token.UP, null); if (state.failed) return type;


                    if ( state.backtracking==0 ) {type =JoinStream.Type.INNER_JOIN;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "join"



    // $ANTLR start "compareOperation"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:422:1: compareOperation returns [Condition.Operator operator] : ( '==' | '!=' | '<=' | '>=' | '<' | '>' | 'contains' | 'instanceof' );
    public final Condition.Operator compareOperation() throws RecognitionException {
        Condition.Operator operator = null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:423:2: ( '==' | '!=' | '<=' | '>=' | '<' | '>' | 'contains' | 'instanceof' )
            int alt76=8;
            switch ( input.LA(1) ) {
            case 65:
                {
                alt76=1;
                }
                break;
            case 49:
                {
                alt76=2;
                }
                break;
            case 63:
                {
                alt76=3;
                }
                break;
            case 67:
                {
                alt76=4;
                }
                break;
            case 62:
                {
                alt76=5;
                }
                break;
            case 66:
                {
                alt76=6;
                }
                break;
            case 78:
                {
                alt76=7;
                }
                break;
            case 95:
                {
                alt76=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return operator;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;

            }

            switch (alt76) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:423:3: '=='
                    {
                    match(input,65,FOLLOW_65_in_compareOperation2845); if (state.failed) return operator;

                    if ( state.backtracking==0 ) {operator =Condition.Operator.EQUAL;}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:424:3: '!='
                    {
                    match(input,49,FOLLOW_49_in_compareOperation2854); if (state.failed) return operator;

                    if ( state.backtracking==0 ) {operator =Condition.Operator.NOT_EQUAL;}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:425:3: '<='
                    {
                    match(input,63,FOLLOW_63_in_compareOperation2862); if (state.failed) return operator;

                    if ( state.backtracking==0 ) {operator =Condition.Operator.LESS_THAN_EQUAL;}

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:426:3: '>='
                    {
                    match(input,67,FOLLOW_67_in_compareOperation2869); if (state.failed) return operator;

                    if ( state.backtracking==0 ) {operator =Condition.Operator.GREATER_THAN_EQUAL;}

                    }
                    break;
                case 5 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:427:3: '<'
                    {
                    match(input,62,FOLLOW_62_in_compareOperation2877); if (state.failed) return operator;

                    if ( state.backtracking==0 ) {operator =Condition.Operator.LESS_THAN;}

                    }
                    break;
                case 6 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:428:3: '>'
                    {
                    match(input,66,FOLLOW_66_in_compareOperation2885); if (state.failed) return operator;

                    if ( state.backtracking==0 ) {operator =Condition.Operator.GREATER_THAN;}

                    }
                    break;
                case 7 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:429:3: 'contains'
                    {
                    match(input,78,FOLLOW_78_in_compareOperation2894); if (state.failed) return operator;

                    if ( state.backtracking==0 ) {operator =Condition.Operator.CONTAINS;}

                    }
                    break;
                case 8 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:430:3: 'instanceof'
                    {
                    match(input,95,FOLLOW_95_in_compareOperation2900); if (state.failed) return operator;

                    if ( state.backtracking==0 ) {operator =Condition.Operator.INSTANCE_OF;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return operator;
    }
    // $ANTLR end "compareOperation"



    // $ANTLR start "id"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:433:1: id returns [String value] : ( ID | ID_QUOTES );
    public final String id() throws RecognitionException {
        String value = null;


        CommonTree ID146=null;
        CommonTree ID_QUOTES147=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:434:5: ( ID | ID_QUOTES )
            int alt77=2;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt77=1;
                }
                break;
            case ID_QUOTES:
                {
                alt77=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return value;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;

            }

            switch (alt77) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:434:7: ID
                    {
                    ID146=(CommonTree)match(input,ID,FOLLOW_ID_in_id2921); if (state.failed) return value;

                    if ( state.backtracking==0 ) {value =(ID146!=null?ID146.getText():null);}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:435:7: ID_QUOTES
                    {
                    ID_QUOTES147=(CommonTree)match(input,ID_QUOTES,FOLLOW_ID_QUOTES_in_id2931); if (state.failed) return value;

                    if ( state.backtracking==0 ) {value =(ID_QUOTES147!=null?ID_QUOTES147.getText():null);}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "id"



    // $ANTLR start "intVal"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:438:1: intVal returns [int value] : ^( SIGNED_VAL POSITIVE_INT_VAL ( '-' )? ) ;
    public final int intVal() throws RecognitionException {
        int value = 0;


        CommonTree POSITIVE_INT_VAL148=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:439:5: ( ^( SIGNED_VAL POSITIVE_INT_VAL ( '-' )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:439:7: ^( SIGNED_VAL POSITIVE_INT_VAL ( '-' )? )
            {
            match(input,SIGNED_VAL,FOLLOW_SIGNED_VAL_in_intVal2955); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            POSITIVE_INT_VAL148=(CommonTree)match(input,POSITIVE_INT_VAL,FOLLOW_POSITIVE_INT_VAL_in_intVal2958); if (state.failed) return value;

            if ( state.backtracking==0 ) {value =Integer.parseInt((POSITIVE_INT_VAL148!=null?POSITIVE_INT_VAL148.getText():null));}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:439:89: ( '-' )?
            int alt78=2;
            switch ( input.LA(1) ) {
                case 57:
                    {
                    alt78=1;
                    }
                    break;
            }

            switch (alt78) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:439:90: '-'
                    {
                    match(input,57,FOLLOW_57_in_intVal2963); if (state.failed) return value;

                    if ( state.backtracking==0 ) {value =value*-1;}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return value;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "intVal"



    // $ANTLR start "longVal"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:442:1: longVal returns [long value] : ^( SIGNED_VAL POSITIVE_LONG_VAL ( '-' )? ) ;
    public final long longVal() throws RecognitionException {
        long value = 0;


        CommonTree POSITIVE_LONG_VAL149=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:443:5: ( ^( SIGNED_VAL POSITIVE_LONG_VAL ( '-' )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:443:7: ^( SIGNED_VAL POSITIVE_LONG_VAL ( '-' )? )
            {
            match(input,SIGNED_VAL,FOLLOW_SIGNED_VAL_in_longVal2990); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            POSITIVE_LONG_VAL149=(CommonTree)match(input,POSITIVE_LONG_VAL,FOLLOW_POSITIVE_LONG_VAL_in_longVal2993); if (state.failed) return value;

            if ( state.backtracking==0 ) {value =Long.parseLong((POSITIVE_LONG_VAL149!=null?POSITIVE_LONG_VAL149.getText():null));}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:443:89: ( '-' )?
            int alt79=2;
            switch ( input.LA(1) ) {
                case 57:
                    {
                    alt79=1;
                    }
                    break;
            }

            switch (alt79) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:443:90: '-'
                    {
                    match(input,57,FOLLOW_57_in_longVal2998); if (state.failed) return value;

                    if ( state.backtracking==0 ) {value =value*-1;}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return value;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "longVal"



    // $ANTLR start "floatVal"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:446:1: floatVal returns [float value] : ^( SIGNED_VAL POSITIVE_FLOAT_VAL ( '-' )? ) ;
    public final float floatVal() throws RecognitionException {
        float value = 0.0f;


        CommonTree POSITIVE_FLOAT_VAL150=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:447:5: ( ^( SIGNED_VAL POSITIVE_FLOAT_VAL ( '-' )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:447:7: ^( SIGNED_VAL POSITIVE_FLOAT_VAL ( '-' )? )
            {
            match(input,SIGNED_VAL,FOLLOW_SIGNED_VAL_in_floatVal3025); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            POSITIVE_FLOAT_VAL150=(CommonTree)match(input,POSITIVE_FLOAT_VAL,FOLLOW_POSITIVE_FLOAT_VAL_in_floatVal3028); if (state.failed) return value;

            if ( state.backtracking==0 ) {value =Float.parseFloat((POSITIVE_FLOAT_VAL150!=null?POSITIVE_FLOAT_VAL150.getText():null));}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:447:93: ( '-' )?
            int alt80=2;
            switch ( input.LA(1) ) {
                case 57:
                    {
                    alt80=1;
                    }
                    break;
            }

            switch (alt80) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:447:94: '-'
                    {
                    match(input,57,FOLLOW_57_in_floatVal3033); if (state.failed) return value;

                    if ( state.backtracking==0 ) {value =value*-1;}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return value;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "floatVal"



    // $ANTLR start "doubleVal"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:450:1: doubleVal returns [double value] : ^( SIGNED_VAL POSITIVE_DOUBLE_VAL ( '-' )? ) ;
    public final double doubleVal() throws RecognitionException {
        double value = 0.0;


        CommonTree POSITIVE_DOUBLE_VAL151=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:451:5: ( ^( SIGNED_VAL POSITIVE_DOUBLE_VAL ( '-' )? ) )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:451:7: ^( SIGNED_VAL POSITIVE_DOUBLE_VAL ( '-' )? )
            {
            match(input,SIGNED_VAL,FOLLOW_SIGNED_VAL_in_doubleVal3060); if (state.failed) return value;

            match(input, Token.DOWN, null); if (state.failed) return value;
            POSITIVE_DOUBLE_VAL151=(CommonTree)match(input,POSITIVE_DOUBLE_VAL,FOLLOW_POSITIVE_DOUBLE_VAL_in_doubleVal3063); if (state.failed) return value;

            if ( state.backtracking==0 ) {value =Double.parseDouble((POSITIVE_DOUBLE_VAL151!=null?POSITIVE_DOUBLE_VAL151.getText():null));}

            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:451:97: ( '-' )?
            int alt81=2;
            switch ( input.LA(1) ) {
                case 57:
                    {
                    alt81=1;
                    }
                    break;
            }

            switch (alt81) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:451:98: '-'
                    {
                    match(input,57,FOLLOW_57_in_doubleVal3068); if (state.failed) return value;

                    if ( state.backtracking==0 ) {value =value*-1;}

                    }
                    break;

            }


            match(input, Token.UP, null); if (state.failed) return value;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "doubleVal"



    // $ANTLR start "boolVal"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:454:1: boolVal returns [boolean value] : BOOL_VAL ;
    public final boolean boolVal() throws RecognitionException {
        boolean value = false;


        CommonTree BOOL_VAL152=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:455:5: ( BOOL_VAL )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:455:7: BOOL_VAL
            {
            BOOL_VAL152=(CommonTree)match(input,BOOL_VAL,FOLLOW_BOOL_VAL_in_boolVal3094); if (state.failed) return value;

            if ( state.backtracking==0 ) {value =Boolean.parseBoolean((BOOL_VAL152!=null?BOOL_VAL152.getText():null));}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "boolVal"



    // $ANTLR start "extensionId"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:458:1: extensionId returns [String value] : id ;
    public final String extensionId() throws RecognitionException {
        String value = null;


        String id153 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:459:5: ( id )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:459:7: id
            {
            pushFollow(FOLLOW_id_in_extensionId3117);
            id153=id();

            state._fsp--;
            if (state.failed) return value;

            if ( state.backtracking==0 ) {value =id153;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "extensionId"



    // $ANTLR start "functionId"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:462:1: functionId returns [String value] : id ;
    public final String functionId() throws RecognitionException {
        String value = null;


        String id154 =null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:463:5: ( id )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:463:7: id
            {
            pushFollow(FOLLOW_id_in_functionId3140);
            id154=id();

            state._fsp--;
            if (state.failed) return value;

            if ( state.backtracking==0 ) {value =id154;}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "functionId"



    // $ANTLR start "stringVal"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:466:1: stringVal returns [String value] : STRING_VAL ;
    public final String stringVal() throws RecognitionException {
        String value = null;


        CommonTree STRING_VAL155=null;

        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:467:5: ( STRING_VAL )
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:467:7: STRING_VAL
            {
            STRING_VAL155=(CommonTree)match(input,STRING_VAL,FOLLOW_STRING_VAL_in_stringVal3163); if (state.failed) return value;

            if ( state.backtracking==0 ) {value =(STRING_VAL155!=null?STRING_VAL155.getText():null);}

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return value;
    }
    // $ANTLR end "stringVal"



    // $ANTLR start "type"
    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:470:1: type returns [Attribute.Type type] : ( 'string' | 'int' | 'long' | 'float' | 'double' | 'bool' );
    public final Attribute.Type type() throws RecognitionException {
        Attribute.Type type = null;


        try {
            // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:471:2: ( 'string' | 'int' | 'long' | 'float' | 'double' | 'bool' )
            int alt82=6;
            switch ( input.LA(1) ) {
            case 118:
                {
                alt82=1;
                }
                break;
            case 96:
                {
                alt82=2;
                }
                break;
            case 100:
                {
                alt82=3;
                }
                break;
            case 86:
                {
                alt82=4;
                }
                break;
            case 83:
                {
                alt82=5;
                }
                break;
            case 75:
                {
                alt82=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return type;}
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;

            }

            switch (alt82) {
                case 1 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:471:3: 'string'
                    {
                    match(input,118,FOLLOW_118_in_type3186); if (state.failed) return type;

                    if ( state.backtracking==0 ) {type =Attribute.Type.STRING;}

                    }
                    break;
                case 2 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:472:3: 'int'
                    {
                    match(input,96,FOLLOW_96_in_type3194); if (state.failed) return type;

                    if ( state.backtracking==0 ) {type =Attribute.Type.INT;}

                    }
                    break;
                case 3 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:473:3: 'long'
                    {
                    match(input,100,FOLLOW_100_in_type3203); if (state.failed) return type;

                    if ( state.backtracking==0 ) {type =Attribute.Type.LONG;}

                    }
                    break;
                case 4 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:474:3: 'float'
                    {
                    match(input,86,FOLLOW_86_in_type3211); if (state.failed) return type;

                    if ( state.backtracking==0 ) {type =Attribute.Type.FLOAT;}

                    }
                    break;
                case 5 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:475:3: 'double'
                    {
                    match(input,83,FOLLOW_83_in_type3219); if (state.failed) return type;

                    if ( state.backtracking==0 ) {type =Attribute.Type.DOUBLE;}

                    }
                    break;
                case 6 :
                    // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:476:3: 'bool'
                    {
                    match(input,75,FOLLOW_75_in_type3227); if (state.failed) return type;

                    if ( state.backtracking==0 ) {type =Attribute.Type.BOOL;}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "type"

    // $ANTLR start synpred14_SiddhiQLGrammarWalker
    public final void synpred14_SiddhiQLGrammarWalker_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:92:4: ( windowStream )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:92:4: windowStream
        {
        pushFollow(FOLLOW_windowStream_in_synpred14_SiddhiQLGrammarWalker315);
        windowStream();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred14_SiddhiQLGrammarWalker

    // $ANTLR start synpred29_SiddhiQLGrammarWalker
    public final void synpred29_SiddhiQLGrammarWalker_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:118:4: ( leftStream join rightStream 'unidirectional' ( condition )? ( time )? )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:118:4: leftStream join rightStream 'unidirectional' ( condition )? ( time )?
        {
        pushFollow(FOLLOW_leftStream_in_synpred29_SiddhiQLGrammarWalker551);
        leftStream();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_join_in_synpred29_SiddhiQLGrammarWalker554);
        join();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_rightStream_in_synpred29_SiddhiQLGrammarWalker556);
        rightStream();

        state._fsp--;
        if (state.failed) return ;

        match(input,120,FOLLOW_120_in_synpred29_SiddhiQLGrammarWalker558); if (state.failed) return ;

        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:118:50: ( condition )?
        int alt88=2;
        switch ( input.LA(1) ) {
            case CONDITION:
                {
                alt88=1;
                }
                break;
        }

        switch (alt88) {
            case 1 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:118:51: condition
                {
                pushFollow(FOLLOW_condition_in_synpred29_SiddhiQLGrammarWalker561);
                condition();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:118:112: ( time )?
        int alt89=2;
        switch ( input.LA(1) ) {
            case CONSTANT:
                {
                alt89=1;
                }
                break;
        }

        switch (alt89) {
            case 1 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:118:113: time
                {
                pushFollow(FOLLOW_time_in_synpred29_SiddhiQLGrammarWalker568);
                time();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred29_SiddhiQLGrammarWalker

    // $ANTLR start synpred32_SiddhiQLGrammarWalker
    public final void synpred32_SiddhiQLGrammarWalker_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:119:4: ( leftStream join rightStream ( condition )? ( time )? )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:119:4: leftStream join rightStream ( condition )? ( time )?
        {
        pushFollow(FOLLOW_leftStream_in_synpred32_SiddhiQLGrammarWalker579);
        leftStream();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_join_in_synpred32_SiddhiQLGrammarWalker581);
        join();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_rightStream_in_synpred32_SiddhiQLGrammarWalker583);
        rightStream();

        state._fsp--;
        if (state.failed) return ;

        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:119:32: ( condition )?
        int alt90=2;
        switch ( input.LA(1) ) {
            case CONDITION:
                {
                alt90=1;
                }
                break;
        }

        switch (alt90) {
            case 1 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:119:33: condition
                {
                pushFollow(FOLLOW_condition_in_synpred32_SiddhiQLGrammarWalker586);
                condition();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:119:94: ( time )?
        int alt91=2;
        switch ( input.LA(1) ) {
            case CONSTANT:
                {
                alt91=1;
                }
                break;
        }

        switch (alt91) {
            case 1 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:119:95: time
                {
                pushFollow(FOLLOW_time_in_synpred32_SiddhiQLGrammarWalker593);
                time();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred32_SiddhiQLGrammarWalker

    // $ANTLR start synpred35_SiddhiQLGrammarWalker
    public final void synpred35_SiddhiQLGrammarWalker_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:124:8: ( windowStream )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:124:8: windowStream
        {
        pushFollow(FOLLOW_windowStream_in_synpred35_SiddhiQLGrammarWalker652);
        windowStream();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred35_SiddhiQLGrammarWalker

    // $ANTLR start synpred36_SiddhiQLGrammarWalker
    public final void synpred36_SiddhiQLGrammarWalker_fragment() throws RecognitionException {
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:129:8: ( windowStream )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:129:8: windowStream
        {
        pushFollow(FOLLOW_windowStream_in_synpred36_SiddhiQLGrammarWalker688);
        windowStream();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred36_SiddhiQLGrammarWalker

    // $ANTLR start synpred39_SiddhiQLGrammarWalker
    public final void synpred39_SiddhiQLGrammarWalker_fragment() throws RecognitionException {
        PatternElement p =null;


        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:145:4: ( ^( 'every' patternItem ) (p= patternStream )? )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:145:4: ^( 'every' patternItem ) (p= patternStream )?
        {
        match(input,84,FOLLOW_84_in_synpred39_SiddhiQLGrammarWalker782); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_patternItem_in_synpred39_SiddhiQLGrammarWalker785);
        patternItem();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;


        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:145:76: (p= patternStream )?
        int alt92=2;
        switch ( input.LA(1) ) {
            case COLLECT:
            case STREAM:
            case 73:
            case 84:
            case 110:
                {
                alt92=1;
                }
                break;
        }

        switch (alt92) {
            case 1 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:145:77: p= patternStream
                {
                pushFollow(FOLLOW_patternStream_in_synpred39_SiddhiQLGrammarWalker793);
                p=patternStream();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred39_SiddhiQLGrammarWalker

    // $ANTLR start synpred41_SiddhiQLGrammarWalker
    public final void synpred41_SiddhiQLGrammarWalker_fragment() throws RecognitionException {
        PatternElement p =null;


        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:146:4: ( ^( 'every' nonEveryPatternStream ) (p= patternStream )? )
        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:146:4: ^( 'every' nonEveryPatternStream ) (p= patternStream )?
        {
        match(input,84,FOLLOW_84_in_synpred41_SiddhiQLGrammarWalker803); if (state.failed) return ;

        match(input, Token.DOWN, null); if (state.failed) return ;
        pushFollow(FOLLOW_nonEveryPatternStream_in_synpred41_SiddhiQLGrammarWalker805);
        nonEveryPatternStream();

        state._fsp--;
        if (state.failed) return ;

        match(input, Token.UP, null); if (state.failed) return ;


        // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:146:98: (p= patternStream )?
        int alt93=2;
        switch ( input.LA(1) ) {
            case COLLECT:
            case STREAM:
            case 73:
            case 84:
            case 110:
                {
                alt93=1;
                }
                break;
        }

        switch (alt93) {
            case 1 :
                // org/wso2/siddhi/query/compiler/SiddhiQLGrammarWalker.g:146:99: p= patternStream
                {
                pushFollow(FOLLOW_patternStream_in_synpred41_SiddhiQLGrammarWalker816);
                p=patternStream();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred41_SiddhiQLGrammarWalker

    // Delegated rules

    public final boolean synpred41_SiddhiQLGrammarWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred41_SiddhiQLGrammarWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred32_SiddhiQLGrammarWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred32_SiddhiQLGrammarWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_SiddhiQLGrammarWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_SiddhiQLGrammarWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred35_SiddhiQLGrammarWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred35_SiddhiQLGrammarWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred36_SiddhiQLGrammarWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred36_SiddhiQLGrammarWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred39_SiddhiQLGrammarWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred39_SiddhiQLGrammarWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred29_SiddhiQLGrammarWalker() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred29_SiddhiQLGrammarWalker_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_DEFINITION_in_executionPlan67 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_definitionStream_in_executionPlan69 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_query_in_executionPlan78 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_streamId_in_definitionStream106 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IN_ATTRIBUTE_in_definitionStream112 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributeName_in_definitionStream114 = new BitSet(new long[]{0x0000000000000000L,0x0040001100480800L});
    public static final BitSet FOLLOW_type_in_definitionStream116 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IP_in_definitionStream126 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUERY_in_query147 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_outputStream_in_query149 = new BitSet(new long[]{0x00000A0100800000L});
    public static final BitSet FOLLOW_inputStream_in_query151 = new BitSet(new long[]{0x0000000010000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_outputProjection_in_query153 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUERY_in_query163 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_inputStream_in_query165 = new BitSet(new long[]{0x0000000010000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_outputProjection_in_query167 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OUT_STREAM_in_outputStream204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_streamId_in_outputStream206 = new BitSet(new long[]{0x0000000000400008L,0x0000000000208100L});
    public static final BitSet FOLLOW_outputType_in_outputStream211 = new BitSet(new long[]{0x0000000000400008L});
    public static final BitSet FOLLOW_IP_in_outputStream219 = new BitSet(new long[]{0x0000000000400008L});
    public static final BitSet FOLLOW_85_in_outputType244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_outputType251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_outputType258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEQUENCE_FULL_in_inputStream280 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sequenceFullStream_in_inputStream282 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_FULL_in_inputStream291 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_patternFullStream_in_inputStream294 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_JOIN_in_inputStream304 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_joinStream_in_inputStream306 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_windowStream_in_inputStream315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basicStream_in_inputStream331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STREAM_in_basicStream362 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_rawStream_in_basicStream364 = new BitSet(new long[]{0x0000400000180008L});
    public static final BitSet FOLLOW_transformHandler_in_basicStream369 = new BitSet(new long[]{0x0000000000180008L});
    public static final BitSet FOLLOW_id_in_basicStream376 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STREAM_in_windowStream405 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ANONYMOUS_in_windowStream409 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_returnQuery_in_windowStream411 = new BitSet(new long[]{0x0000C00000008000L});
    public static final BitSet FOLLOW_filterHandler_in_windowStream416 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_transformHandler_in_windowStream423 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_windowHandler_in_windowStream430 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_id_in_windowStream437 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STREAM_in_windowStream448 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_streamId_in_windowStream452 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterHandler_in_windowStream457 = new BitSet(new long[]{0x0000C00000000000L});
    public static final BitSet FOLLOW_transformHandler_in_windowStream464 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_windowHandler_in_windowStream471 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_id_in_windowStream478 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ANONYMOUS_in_rawStream500 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_returnQuery_in_rawStream502 = new BitSet(new long[]{0x0000000000008008L});
    public static final BitSet FOLLOW_filterHandler_in_rawStream507 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_streamId_in_rawStream520 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_filterHandler_in_rawStream525 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_leftStream_in_joinStream551 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_join_in_joinStream554 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rightStream_in_joinStream556 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_joinStream558 = new BitSet(new long[]{0x0000000000000A02L});
    public static final BitSet FOLLOW_condition_in_joinStream561 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_time_in_joinStream568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftStream_in_joinStream579 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_join_in_joinStream581 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rightStream_in_joinStream583 = new BitSet(new long[]{0x0000000000000A02L});
    public static final BitSet FOLLOW_condition_in_joinStream586 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_time_in_joinStream593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftStream_in_joinStream610 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_joinStream612 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_join_in_joinStream615 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rightStream_in_joinStream617 = new BitSet(new long[]{0x0000000000000A02L});
    public static final BitSet FOLLOW_condition_in_joinStream620 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_time_in_joinStream627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_windowStream_in_leftStream652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basicStream_in_leftStream663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_windowStream_in_rightStream688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_basicStream_in_rightStream699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_QUERY_in_returnQuery727 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_inputStream_in_returnQuery730 = new BitSet(new long[]{0x0000000010000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_outputProjection_in_returnQuery732 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PATTERN_in_patternFullStream751 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_patternStream_in_patternFullStream754 = new BitSet(new long[]{0x0000000000000808L});
    public static final BitSet FOLLOW_time_in_patternFullStream759 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_84_in_patternStream782 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_patternItem_in_patternStream785 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_patternStream_in_patternStream793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_patternStream803 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nonEveryPatternStream_in_patternStream805 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_patternStream_in_patternStream816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_patternItem_in_patternStream825 = new BitSet(new long[]{0x0000080000000082L,0x0000400000100200L});
    public static final BitSet FOLLOW_patternStream_in_patternStream832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_patternItem_in_nonEveryPatternStream855 = new BitSet(new long[]{0x0000080000000082L,0x0000400000000200L});
    public static final BitSet FOLLOW_nonEveryPatternStream_in_nonEveryPatternStream862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SEQUENCE_in_sequenceFullStream882 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_sequenceStream_in_sequenceFullStream885 = new BitSet(new long[]{0x0000000000000808L});
    public static final BitSet FOLLOW_time_in_sequenceFullStream890 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_sequenceItem_in_sequenceStream924 = new BitSet(new long[]{0x0000084000000002L,0x0000400000000000L});
    public static final BitSet FOLLOW_73_in_patternItem946 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_itemStream_in_patternItem950 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_itemStream_in_patternItem954 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_110_in_patternItem964 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_itemStream_in_patternItem969 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_itemStream_in_patternItem973 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COLLECT_in_patternItem982 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_itemStream_in_patternItem984 = new BitSet(new long[]{0x1000000800000000L});
    public static final BitSet FOLLOW_collect_in_patternItem986 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_itemStream_in_patternItem995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_110_in_sequenceItem1018 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_itemStream_in_sequenceItem1022 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_itemStream_in_sequenceItem1026 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REGEX_in_sequenceItem1040 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_itemStream_in_sequenceItem1042 = new BitSet(new long[]{0x00C0000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_regex_in_sequenceItem1044 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_itemStream_in_sequenceItem1055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STREAM_in_itemStream1086 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_rawStream_in_itemStream1088 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_attributeName_in_itemStream1092 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_54_in_regex1118 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_55_in_regex1123 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_regex1127 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_regex1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_externalCall_in_outputProjection1157 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_OUT_ATTRIBUTES_in_outputProjection1164 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_outputAttributeList_in_outputProjection1166 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_groupBy_in_outputProjection1176 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static final BitSet FOLLOW_having_in_outputProjection1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_outputAttributeList1211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OUT_ATTRIBUTE_in_outputAttributeList1220 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_outputItem_in_outputAttributeList1222 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_id_in_outputItem1243 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_extensionOutFunction_in_outputItem1245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_outFunction_in_outputItem1256 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_id_in_outputItem1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_outputItem1269 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_id_in_outputItem1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeVariable_in_outputItem1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENSION_FUNCTION_in_extensionOutFunction1307 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_extensionId_in_extensionOutFunction1309 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_functionId_in_extensionOutFunction1311 = new BitSet(new long[]{0x0000000040000008L});
    public static final BitSet FOLLOW_parameters_in_extensionOutFunction1344 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_in_outFunction1373 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_outFunction1375 = new BitSet(new long[]{0x0000000040000008L});
    public static final BitSet FOLLOW_parameters_in_outFunction1380 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_89_in_groupBy1408 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attributeVariable_in_groupBy1411 = new BitSet(new long[]{0x0000000000000028L});
    public static final BitSet FOLLOW_90_in_having1432 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_having1434 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_77_in_externalCall1450 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_externalCall1453 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameters_in_externalCall1455 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FILTER_in_filterHandler1475 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_condition_in_filterHandler1477 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TRANSFORM_in_transformHandler1498 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_extensibleId_in_transformHandler1500 = new BitSet(new long[]{0x0000000040000008L});
    public static final BitSet FOLLOW_parameters_in_transformHandler1506 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WINDOW_in_windowHandler1528 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_extensibleId_in_windowHandler1530 = new BitSet(new long[]{0x0000000040000008L});
    public static final BitSet FOLLOW_parameters_in_windowHandler1536 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_id_in_extensibleId1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENSION_in_extensibleId1573 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_extensionId_in_extensibleId1577 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_functionId_in_extensibleId1579 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMETERS_in_parameters1617 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_in_parameters1620 = new BitSet(new long[]{0x0AC8000000004828L,0x0040001100480800L});
    public static final BitSet FOLLOW_constant_in_time1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_parameter1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_countStart_in_collect1682 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_collect1684 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_countEnd_in_collect1686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_countStart_in_collect1694 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_collect1696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_60_in_collect1705 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_countEnd_in_collect1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_countStartAndEnd_in_collect1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_countStart1743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_countEnd1760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_countStartAndEnd1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONDITION_in_condition1801 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditionExpression_in_condition1803 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_110_in_conditionExpression1825 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditionExpression_in_conditionExpression1829 = new BitSet(new long[]{0xC002000000000440L,0x000050008000420EL});
    public static final BitSet FOLLOW_conditionExpression_in_conditionExpression1833 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_73_in_conditionExpression1846 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditionExpression_in_conditionExpression1850 = new BitSet(new long[]{0xC002000000000440L,0x000050008000420EL});
    public static final BitSet FOLLOW_conditionExpression_in_conditionExpression1854 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_compareOperation_in_conditionExpression1868 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_conditionExpression1872 = new BitSet(new long[]{0x0AC8000000004820L,0x0040001100480800L});
    public static final BitSet FOLLOW_expression_in_conditionExpression1876 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_108_in_conditionExpression1896 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_conditionExpression_in_conditionExpression1900 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONDITION_FUNCTION_in_conditionExpression1919 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_extensionId_in_conditionExpression1921 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_functionId_in_conditionExpression1923 = new BitSet(new long[]{0x0000000040000008L});
    public static final BitSet FOLLOW_parameters_in_conditionExpression1928 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_boolVal_in_conditionExpression1941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_expression1974 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1978 = new BitSet(new long[]{0x0AC8000000004820L,0x0040001100480800L});
    public static final BitSet FOLLOW_expression_in_expression1982 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_59_in_expression1994 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression1998 = new BitSet(new long[]{0x0AC8000000004820L,0x0040001100480800L});
    public static final BitSet FOLLOW_expression_in_expression2002 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_54_in_expression2014 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2018 = new BitSet(new long[]{0x0AC8000000004820L,0x0040001100480800L});
    public static final BitSet FOLLOW_expression_in_expression2022 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_57_in_expression2034 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2038 = new BitSet(new long[]{0x0AC8000000004820L,0x0040001100480800L});
    public static final BitSet FOLLOW_expression_in_expression2042 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_55_in_expression2054 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_expression2058 = new BitSet(new long[]{0x0AC8000000004820L,0x0040001100480800L});
    public static final BitSet FOLLOW_expression_in_expression2062 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_valueExpression_in_expression2072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_valueExpression2101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_valueExpression2113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeVariable_in_valueExpression2129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EXTENSION_FUNCTION_in_valueExpression2140 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_extensionId_in_valueExpression2142 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_functionId_in_valueExpression2144 = new BitSet(new long[]{0x0000000040000008L});
    public static final BitSet FOLLOW_parameters_in_valueExpression2149 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTANT_in_constant2177 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_intVal_in_constant2179 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTANT_in_constant2191 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_longVal_in_constant2193 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTANT_in_constant2204 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_floatVal_in_constant2206 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTANT_in_constant2217 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_doubleVal_in_constant2219 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTANT_in_constant2229 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_boolVal_in_constant2231 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTANT_in_constant2242 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stringVal_in_constant2244 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTANT_in_constant2254 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_timeExpr_in_constant2256 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_EXP_in_timeExpr2280 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_yearValue_in_timeExpr2283 = new BitSet(new long[]{0x0000000800000008L});
    public static final BitSet FOLLOW_monthValue_in_timeExpr2292 = new BitSet(new long[]{0x0000000800000008L});
    public static final BitSet FOLLOW_weekValue_in_timeExpr2301 = new BitSet(new long[]{0x0000000800000008L});
    public static final BitSet FOLLOW_dayValue_in_timeExpr2310 = new BitSet(new long[]{0x0000000800000008L});
    public static final BitSet FOLLOW_hourValue_in_timeExpr2320 = new BitSet(new long[]{0x0000000800000008L});
    public static final BitSet FOLLOW_minuteValue_in_timeExpr2329 = new BitSet(new long[]{0x0000000800000008L});
    public static final BitSet FOLLOW_secondValue_in_timeExpr2340 = new BitSet(new long[]{0x0000000800000008L});
    public static final BitSet FOLLOW_milliSecondValue_in_timeExpr2349 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_yearValue2375 = new BitSet(new long[]{0x0000000000000000L,0x6000000000000000L});
    public static final BitSet FOLLOW_set_in_yearValue2377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_monthValue2406 = new BitSet(new long[]{0x0000000000000000L,0x00000C0000000000L});
    public static final BitSet FOLLOW_set_in_monthValue2408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_weekValue2436 = new BitSet(new long[]{0x0000000000000000L,0x0600000000000000L});
    public static final BitSet FOLLOW_set_in_weekValue2438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_dayValue2468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
    public static final BitSet FOLLOW_set_in_dayValue2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_hourValue2499 = new BitSet(new long[]{0x0000000000000000L,0x0000000018000000L});
    public static final BitSet FOLLOW_set_in_hourValue2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_minuteValue2529 = new BitSet(new long[]{0x0000000000000000L,0x0000038000000000L});
    public static final BitSet FOLLOW_set_in_minuteValue2531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_secondValue2561 = new BitSet(new long[]{0x0000000000000000L,0x001C000000000000L});
    public static final BitSet FOLLOW_set_in_secondValue2563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_milliSecondValue2595 = new BitSet(new long[]{0x0000000000000000L,0x0000006000000000L});
    public static final BitSet FOLLOW_set_in_milliSecondValue2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_streamId2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_streamPositionAttributeName_in_attributeVariable2639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_streamAttributeName_in_attributeVariable2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_attributeName_in_attributeVariable2660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_streamPositionAttributeName2683 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_streamId_in_streamPositionAttributeName2686 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_streamPositionAttributeName2690 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_id_in_streamPositionAttributeName2695 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_streamAttributeName2716 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_streamId_in_streamAttributeName2719 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_id_in_streamAttributeName2724 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATTRIBUTE_in_attributeName2744 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_id_in_attributeName2746 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_98_in_join2768 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_111_in_join2771 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_99_in_join2773 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_98_in_join2787 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_111_in_join2790 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_113_in_join2792 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_98_in_join2806 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_111_in_join2809 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_88_in_join2811 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_98_in_join2823 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_93_in_join2825 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_65_in_compareOperation2845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_compareOperation2854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_compareOperation2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_compareOperation2869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_compareOperation2877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_compareOperation2885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_compareOperation2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_95_in_compareOperation2900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_id2921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_QUOTES_in_id2931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIGNED_VAL_in_intVal2955 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_POSITIVE_INT_VAL_in_intVal2958 = new BitSet(new long[]{0x0200000000000008L});
    public static final BitSet FOLLOW_57_in_intVal2963 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SIGNED_VAL_in_longVal2990 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_POSITIVE_LONG_VAL_in_longVal2993 = new BitSet(new long[]{0x0200000000000008L});
    public static final BitSet FOLLOW_57_in_longVal2998 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SIGNED_VAL_in_floatVal3025 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_POSITIVE_FLOAT_VAL_in_floatVal3028 = new BitSet(new long[]{0x0200000000000008L});
    public static final BitSet FOLLOW_57_in_floatVal3033 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SIGNED_VAL_in_doubleVal3060 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_POSITIVE_DOUBLE_VAL_in_doubleVal3063 = new BitSet(new long[]{0x0200000000000008L});
    public static final BitSet FOLLOW_57_in_doubleVal3068 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOOL_VAL_in_boolVal3094 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_extensionId3117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_id_in_functionId3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_VAL_in_stringVal3163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_118_in_type3186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_96_in_type3194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_100_in_type3203 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_type3211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_type3219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_type3227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_windowStream_in_synpred14_SiddhiQLGrammarWalker315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftStream_in_synpred29_SiddhiQLGrammarWalker551 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_join_in_synpred29_SiddhiQLGrammarWalker554 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rightStream_in_synpred29_SiddhiQLGrammarWalker556 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_120_in_synpred29_SiddhiQLGrammarWalker558 = new BitSet(new long[]{0x0000000000000A02L});
    public static final BitSet FOLLOW_condition_in_synpred29_SiddhiQLGrammarWalker561 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_time_in_synpred29_SiddhiQLGrammarWalker568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_leftStream_in_synpred32_SiddhiQLGrammarWalker579 = new BitSet(new long[]{0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_join_in_synpred32_SiddhiQLGrammarWalker581 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_rightStream_in_synpred32_SiddhiQLGrammarWalker583 = new BitSet(new long[]{0x0000000000000A02L});
    public static final BitSet FOLLOW_condition_in_synpred32_SiddhiQLGrammarWalker586 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_time_in_synpred32_SiddhiQLGrammarWalker593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_windowStream_in_synpred35_SiddhiQLGrammarWalker652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_windowStream_in_synpred36_SiddhiQLGrammarWalker688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_synpred39_SiddhiQLGrammarWalker782 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_patternItem_in_synpred39_SiddhiQLGrammarWalker785 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_patternStream_in_synpred39_SiddhiQLGrammarWalker793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_synpred41_SiddhiQLGrammarWalker803 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nonEveryPatternStream_in_synpred41_SiddhiQLGrammarWalker805 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_patternStream_in_synpred41_SiddhiQLGrammarWalker816 = new BitSet(new long[]{0x0000000000000002L});

}