Feature: Validar inserción de columnas de IVA (IVA 0%, IVA exento y IVA retenido)

  Scenario: Validación de columnas de IVA en el reporte exportado
    Given El usuario exporta el reporte
    When El usuario revisa el archivo Excel exportado
    Then El Excel incluye las columnas 'IVA 0%', 'IVA exento' y 'IVA retenido' con los respectivos montos