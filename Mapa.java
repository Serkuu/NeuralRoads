<?php
require_once ('Zgloszenie.php');

namespace Struktura;



use Struktura;
/**
 * @author s33314
 * @version 1.0
 * @created 27-maj-2026 15:32:44
 */
class Mapa
{

	/**
	 * Domy�lny poziom przybli�enia
	 */
	private $domyslnyZoom;
	private $id;
	/**
	 * Ostatnio u�yty filtr
	 */
	private $ostatniFiltr;
	/**
	 * np. OpenStreetMap
	 */
	private $typMapy;
	public $m_Zgloszenie;

	function __construct()
	{
	}

	function __destruct()
	{
	}



	public function filtruj()
	{
	}

	public function zaktualizujWidokMapy()
	{
	}

}
?>