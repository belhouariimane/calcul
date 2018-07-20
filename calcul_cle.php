<?php
function calcul_cle($code) 
{ 
	$sum_pair=0;
	$sum_impair=0;
 	for($i=0;$i<strlen($code);++$i){
 		if($i%2 == 0){
			$sum_pair+= $code[$i] *3;
		}
 		else{
			$sum_impair+=$code[$i];
		}
 }
 $reste=variant_int(($sum_impair+$sum_pair)/10);
 if($reste==0){
 	return 0;
 }else{
 	return 10-$reste;
 }
}
$cle=calcul_cle('303792016200');
echo $cle;
?>
