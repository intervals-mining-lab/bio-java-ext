package libiada.Root;

/**
 * Created by IntelliJ IDEA.
 * User: InquisitioN
 * Date: 19.11.2010
 * Time: 17:10:33
 * To change this template use File | Settings | File Templates.
 */
public interface IBaseObject {
        /// ����� ������������ �������
        ///</summary>
        ///<returns>����� ������� �������</returns>
        IBaseObject Clone();

        ///<summary>
        /// ����� ����������� ��������� ���������������
        ///</summary>
        ///<param name="obj">������ c ������� ���������� �������� �� ���������������</param>
        ///<returns>True ���� ������� ������������, ����� false</returns>
        boolean Equals(Object obj);

        IBin GetBin();
}
