<?php
	/* Author: Dominik Bälz
	 * Last: 20/10/2016
	 * Description: Contains the main logic (Procedural Style)
	*/
	
	echo $_GET['fst'];
	echo $_GET['sth'];
	echo $_GET['ast'];
	echo $_GET['baujahr'];
	
	$handle = fopen("kosten.csv","w+");
	$data = '"Fläche je Stockwerk in QM";"Anzahl der Stockwerke";"Baujahr";'."\n";
	$data .= '"'. $_GET['fst'] . '";' . $_GET['sth'] . '";' . $_GET['ast'] . '";' . $_GET['baujahr'] . '";' .  "\n";
	fwrite($handle,$data);
	fclose($handle);
	
?>