# excelutils
# 一个通用的Excel导入导出工具
使用ExcelUtils里面的parseExcelToList方法进行导入
使用ExcelUtils里面的exportExcel方法进行导出

以下四个注解是导入导出的实体类需要依赖的注解
EnableExport
该注解使用在类上，设置允许导入导出
EnableExportField
该注解设置在字段上，设置允许导出该字段，并且可以设置宽度，标题名，背景颜色
EnableSelectList
该注解设置在字段上，设置是否使用下拉列表
ImportIndex
该注解设置在字段上，设置允许导入，并且设置导入时对应的Excel列索引

ColorEnum
该枚举是一个颜色枚举，里面有一些常用颜色

 
    使用示例：
    实体类：
    @EnableExport(fileName = "")
    public class SlrEmpSalary implements Serializable {
    @ImportIndex(index = 0)
      @EnableExportField(colName = "序号", colWidth = 80)
      private int seqNumber;
      @ImportIndex(index = 1)
      @EnableExportField(colName = "员工编号", colWidth = 160,cellColor = ColorEnum.RED)
      private String employeeCode;
      @ImportIndex(index = 2)
      @EnableExportField(colName = "员工姓名", colWidth = 160)
      private String employeeName;}
    
    导入使用方法：
    //文件输入流
     inputStream =uploadedFile.getInputStream();
     //获取对象集合
     List< SlrEmpSalary> empSalaryList =
                (List< SlrEmpSalary>)ExcelUtils.parseExcelToList(inputStream,  SlrEmpSalary.class);
                
     导出使用方法：
     //导出数据
     List< SlrEmpSalary> dataList = new ArrayList<SlrEmpSalary>();
     //导出
     FileUtils.exportExcel(outputStream, dataList,  SlrEmpSalary.class, Const.ALL_SELECT_LIST_MAP, exportTitle);
                
                
                
    
    
    
