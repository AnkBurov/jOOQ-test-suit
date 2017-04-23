/**
 * This class is generated by jOOQ
 */
package app.generated.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.4.1" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserRecord extends org.jooq.impl.UpdatableRecordImpl<app.generated.tables.records.UserRecord> implements org.jooq.Record3<java.lang.Integer, java.lang.String, java.lang.Integer> {

	private static final long serialVersionUID = 600452711;

	/**
	 * Setter for <code>public.user.ID</code>.
	 */
	public void setId(java.lang.Integer value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>public.user.ID</code>.
	 */
	public java.lang.Integer getId() {
		return (java.lang.Integer) getValue(0);
	}

	/**
	 * Setter for <code>public.user.LOGIN</code>.
	 */
	public void setLogin(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>public.user.LOGIN</code>.
	 */
	public java.lang.String getLogin() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>public.user.CATEGORY_ID</code>.
	 */
	public void setCategoryId(java.lang.Integer value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>public.user.CATEGORY_ID</code>.
	 */
	public java.lang.Integer getCategoryId() {
		return (java.lang.Integer) getValue(2);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record3 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.Integer> fieldsRow() {
		return (org.jooq.Row3) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row3<java.lang.Integer, java.lang.String, java.lang.Integer> valuesRow() {
		return (org.jooq.Row3) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field1() {
		return app.generated.tables.User.USER.ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return app.generated.tables.User.USER.LOGIN;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Integer> field3() {
		return app.generated.tables.User.USER.CATEGORY_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value1() {
		return getId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getLogin();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Integer value3() {
		return getCategoryId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value1(java.lang.Integer value) {
		setId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value2(java.lang.String value) {
		setLogin(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord value3(java.lang.Integer value) {
		setCategoryId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public UserRecord values(java.lang.Integer value1, java.lang.String value2, java.lang.Integer value3) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached UserRecord
	 */
	public UserRecord() {
		super(app.generated.tables.User.USER);
	}

	/**
	 * Create a detached, initialised UserRecord
	 */
	public UserRecord(java.lang.Integer id, java.lang.String login, java.lang.Integer categoryId) {
		super(app.generated.tables.User.USER);

		setValue(0, id);
		setValue(1, login);
		setValue(2, categoryId);
	}
}
