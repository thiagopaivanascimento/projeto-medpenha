<?xml version='1.0' encoding='iso-8859-1'?>
<!DOCTYPE helpset PUBLIC "-//Sun Microsystems Inc.//DTD JavaHelp HelpSet Version 2.0//EN"   "http://java.sun.com/products/javahelp/helpset_2_0.dtd">

<helpset version="2.0">
	<title>Sistema de Ajuda MEDPENHA</title>
	<maps>
		<homeID>Introdu��o</homeID>
		<mapref location ="mapaSEC.jhm"/>
	</maps>
	<view>
		<name>Cont</name>
		<label>Conte�do</label>
		<type>javax.help.TOCView</type>
		<data>conteudoSEC.xml</data>
	</view>
	
	<view>
		<name>Ind</name>
		<label>�ndice</label>
		<type>javax.help.IndexView</type>
		<data>indiceSEC.xml</data>
	</view>
		
	<view>
		<name>Pesq</name>
		<label>Pesquisa</label>
		<type>javax.help.SearchView</type>
		<data engine="com.sun.java.help.search.DefaultSearchEngine">
			JavaHelpSearch
		</data>
	</view>	
</helpset>